package com.lugarsoft.java_concepts.solid.singleresponsability;

import com.lugarsoft.java_concepts.domain.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeValidator {

    /**
     * This class has the single responsibility of validating if employee is valid or not
     * **/

    public boolean isValid(Employee emp){
        if(emp.getEmail().isEmpty()){
            return false;
        }
        if(emp.getFirstName().isEmpty()){
            return false;
        }
       if(emp.getLastName().isEmpty()){
           return false;
       }
       return true;
    }
}
