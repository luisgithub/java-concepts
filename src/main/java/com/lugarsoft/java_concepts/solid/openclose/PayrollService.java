package com.lugarsoft.java_concepts.solid.openclose;

import com.lugarsoft.java_concepts.domain.Employee;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PayrollService {

    public Map<Long, Double> callculatePayRoll(List<Employee> employeeList){
        Map<Long, Double> payroll = new HashMap<>();
        for(Employee emp : employeeList){
            payroll.put(emp.getId(), emp.calculatePay());
        }
        return  payroll;
    }
}
