package com.lugarsoft.java_concepts.SOLID;

import com.lugarsoft.java_concepts.domain.Employee;
import com.lugarsoft.java_concepts.solid.singleresponsability.EmployeeProcessor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import utils.EmployeeUtils;


@ExtendWith(MockitoExtension.class)
public class SingleResponsibilityTest {

    @Mock
    EmployeeProcessor employeeProcessor;

    @Test
    void create_employee_single_responsibility_success(){
        Employee employee = EmployeeUtils.generateEmployeeList(2L).get(0);
        employeeProcessor.createEmployeeRecord(employee);
        Mockito.verify(employeeProcessor).createEmployeeRecord(employee);
    }
}
