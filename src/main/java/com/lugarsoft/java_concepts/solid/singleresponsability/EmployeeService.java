package com.lugarsoft.java_concepts.solid.singleresponsability;

import com.lugarsoft.java_concepts.domain.Employee;

public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    public void createEmployee(Employee employee){
        employeeRepository.save(employee);
    }

}
