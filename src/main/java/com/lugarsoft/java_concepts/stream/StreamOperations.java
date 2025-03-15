package com.lugarsoft.java_concepts.stream;

import com.lugarsoft.java_concepts.domain.Employee;
import org.springframework.stereotype.Component;
import utils.EmployeeUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class StreamOperations {

    public boolean allEmployeesAreOlderThan5(){
        List<Employee> employeeList = EmployeeUtils.generateEmployeeList(10L);
        return employeeList.stream().allMatch(employee -> employee.getAge()>5);
    }

    public boolean anyEmployeeIsUnder5YearsOld(){
        List<Employee> employees = EmployeeUtils.generateEmployeeList(10L);
        return employees.stream().noneMatch(emp -> emp.getAge() < 5);
    }

    public Optional<Employee> findFirstEmployee(){
        List<Employee> employees = EmployeeUtils.generateEmployeeList(10L);
        return employees.stream().findFirst();
    }

    public Optional<Employee> findAnyEmployee() {
        List<Employee> employees = EmployeeUtils.generateEmployeeList(5L);
        return employees.stream().findAny();
    }

    public Stream<Employee> concatenateTwoStreams() {
        List<Employee> employeeList1 = EmployeeUtils.generateEmployeeList(5L);
        List<Employee> employeeList2 = EmployeeUtils.generateEmployeeList(5L);
        return Stream.concat(employeeList1.stream(),employeeList2.stream());
    }

    public Stream<Employee> getFilteredEmployeesByCity(){
        List<Employee> employees = EmployeeUtils.generateEmployeeList(10L);
        return employees.stream().filter(emp -> emp.getCity().equals("Boston"));
    }

}
