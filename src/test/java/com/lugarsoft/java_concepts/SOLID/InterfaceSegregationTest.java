package com.lugarsoft.java_concepts.SOLID;

import com.lugarsoft.java_concepts.domain.Employee;
import com.lugarsoft.java_concepts.domain.EmployeeType;
import com.lugarsoft.java_concepts.solid.interfaceseg.EmployeeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InterfaceSegregationTest {

    @Autowired private EmployeeService employeeService;

    /*
     * Both OrderService and EmployeeService implements PersistenceService interface,
     * but since EmployeeService need an extra method for looking for an employee by
     * firstName instead of adding that method to PersistenceService which would be
     * breaking the interface segregation principle, we did so in the EmployeeService
     * itself
     */

    @Test
    void interface_segregation_principle_test(){
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setFirstName("Laslo");
        employee.setLastName("Losla");
        employee.setSalary(200d);
        employee.setEmail("laslo@mail.com");
        employee.setCity("Tucson");
        employee.setEmployeeType(EmployeeType.FULL_TIME);
        employee.setAge(50);
        Employee saved = employeeService.save(employee);
        Assertions.assertNotNull(saved);
        System.out.println(saved);
    }
}
