package com.lugarsoft.java_concepts.domain;

import com.lugarsoft.java_concepts.solid.openclose.PayCalculator;

public class Employee extends Entity {
    public Employee() {
    }

    protected String firstName;
    protected String lastName;
    protected String email;
    protected String city;
    protected int age;
    protected EmployeeType employeeType;
    protected double salary;
    private PayCalculator payCalculator;




    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void setPayCalculator(PayCalculator payCalculator) {
        this.payCalculator = payCalculator;
    }

    public double calculatePay() {
        return payCalculator.calculatePayroll(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", employeeType=" + employeeType +
                ", salary=" + salary +
                ", payCalculator=" + payCalculator +
                '}';
    }
}
