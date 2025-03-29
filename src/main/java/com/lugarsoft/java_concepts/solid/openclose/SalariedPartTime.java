package com.lugarsoft.java_concepts.solid.openclose;

import com.lugarsoft.java_concepts.domain.Employee;

public class SalariedPartTime implements PayCalculator{
    private final double hoursPerWeek;
    private final double hourlyRate;

    public SalariedPartTime(double hoursPerWeek, double hourlyRate) {
        this.hoursPerWeek = hoursPerWeek;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePayroll(Employee employee) {
        return hoursPerWeek * hourlyRate;
    }
}
