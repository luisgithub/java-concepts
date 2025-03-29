package com.lugarsoft.java_concepts.solid.openclose;

import com.lugarsoft.java_concepts.domain.Employee;

public class SalariedFullTime implements PayCalculator {
    @Override
    public double calculatePayroll(Employee employee) {
        //5 days a week 8 hour per day
        return employee.getSalary() * 5 * 8;
    }
}
