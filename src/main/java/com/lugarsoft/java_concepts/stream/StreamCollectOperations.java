package com.lugarsoft.java_concepts.stream;

import com.lugarsoft.java_concepts.domain.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import utils.EmployeeUtils;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;
import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

@Slf4j
@Component
public class StreamCollectOperations {

    // return a list of employees
    public List<Employee> listEmployees(){
        return EmployeeUtils.generateEmployeeList(10L);
    }

    // based on a given list of employees
    public Map<String, Set<String>> groupEmployeesByCity() {
        List<Employee> employees = EmployeeUtils.generateEmployeeList(10L);
        Map<String, Set<String>> employeesByCity = employees.stream()
                .collect(groupingBy(Employee::getCity, mapping(employee -> employee.getFirstName() + " " +employee.getLastName(), toSet())));
        return employeesByCity;
    }

    public double calculateAverageInAgeAsDouble(){
        List<Employee> employees = EmployeeUtils.generateEmployeeList(10L);
        return employees.stream().collect(averagingDouble(Employee::getAge));
    }

    public double calculateAverageInAgeAsInt(){
        List<Employee> employees = EmployeeUtils.generateEmployeeList(10L);
        return employees.stream().collect(averagingInt(Employee::getAge));
    }

    public Optional<Employee> getOldestEmployee(){
        List<Employee> employeeList = EmployeeUtils.generateEmployeeList(20L);
        Optional<Employee> max = employeeList.stream().collect(maxBy(Comparator.comparingInt(Employee::getAge)));
        return max;
    }

    public Optional<Employee> getYoungestEmployee(){
        List<Employee> employees = EmployeeUtils.generateEmployeeList(10L);
        Optional<Employee> yougest = employees.stream().collect(minBy(Comparator.comparingInt(Employee::getAge)));
        return yougest;
    }

    public Map<Boolean, List<Employee>> getEmployeeesPartitionedByCity(){
        List<Employee> employees = EmployeeUtils.generateEmployeeList(20L);
        Map<Boolean, List<Employee>> employePartitionedByCity = employees.stream().collect(partitioningBy(employee -> employee.getCity().equals("Boston")));
        return employePartitionedByCity;
    }

    public Map<Integer, Object> convertEmployeeListToReducedMap(){
        List<Employee> employees = EmployeeUtils.generateEmployeeList(5L);
        Map<Integer,Object> employeeReducedMap = employees.stream().collect(toMap(employee -> Integer.valueOf(String.valueOf(employee.getId())),Employee::getFirstName));
        return  employeeReducedMap;
    }
}
