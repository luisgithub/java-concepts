package com.lugarsoft.java_concepts;

import com.lugarsoft.java_concepts.solid.single.EmployeeController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SingleResponsibilityTest {

    @Autowired private EmployeeController employeeController;

    @Test
    void create_employee_single_responsibility_success(){
        String employeeJson = "{\"id\": 1, \"firstName\": \"Rene\", \"lastName\" : \"Lopez\", \"email\": \"rene@mail.com\", \"age\" : 32 }";
        String result = employeeController.create(employeeJson);
        Assertions.assertEquals(result, "SUCCESS");
    }
}
