package com.lugarsoft.java_concepts.stream;

import com.lugarsoft.java_concepts.domain.Employee;
import org.springframework.stereotype.Component;
import utils.EmployeeUtils;

import java.util.List;
import java.util.Optional;

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
}
