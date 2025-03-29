package com.lugarsoft.java_concepts.solid.single;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lugarsoft.java_concepts.domain.Employee;
import org.springframework.stereotype.Component;


@Component
public class EmployeeController {

    /**
     * This clas has the responsibility of receiving the request and getting response back
     * **/
    private final EmployeeValidator employeeValidator = new EmployeeValidator();
    private final EmployeeRepository employeeRepository = new EmployeeRepository();

    public String create(String employeeJson){
        ObjectMapper mapper = new ObjectMapper();
        Employee emp;
        try {
            emp = mapper.readValue(employeeJson, Employee.class);
            boolean valid = employeeValidator.isValid(emp);
            if(!valid){
                return "ERROR";
            }
            employeeRepository.save(emp);
            return "SUCCESS";
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }

}
