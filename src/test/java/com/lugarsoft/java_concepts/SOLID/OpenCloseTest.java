package com.lugarsoft.java_concepts.SOLID;

import com.lugarsoft.java_concepts.domain.Employee;
import com.lugarsoft.java_concepts.solid.openclose.PayrollService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import utils.EmployeeUtils;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class OpenCloseTest {
    @Autowired
    PayrollService payrollService;

    @Test
    void open_close_employe_payroll_calculation() {
        List<Employee> employeeList = EmployeeUtils.generateEmployeeList(5L);
        Map<Long,Double> payroll = payrollService.callculatePayRoll(employeeList);

        for(Map.Entry entry : payroll.entrySet()){
            System.out.println("Salary calculated for " + entry.getKey() + " = " + entry.getValue());
            Assertions.assertTrue((Double)entry.getValue()>0);
        }
    }

}
