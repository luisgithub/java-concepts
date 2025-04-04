package com.lugarsoft.java_concepts.solid.singleresponsability;

import com.lugarsoft.java_concepts.domain.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeProcessor {

    /*
    *
    * Single Responsibility Principle SRP states that a class should have only
    * one reason to change, meaning it should have only one job or responsibility.
    *
    * */

    private final EmployeeService employeeService;
    private final NotificationService notificationService;

    public EmployeeProcessor(EmployeeService employeeService, NotificationService notificationService){
        this.employeeService = employeeService;
        this.notificationService = notificationService;
    }

    public void createEmployeeRecord(Employee employee){
        employeeService.createEmployee(employee);
        EmailNotification emailNotification = new EmailNotification();
        emailNotification.setFrom("employee.office@mail.com");
        emailNotification.setTo("employe.name@mail.com");
        emailNotification.setSubject("You have been registered as employee in company X");
        emailNotification.setBody("Based on the process you followed you are hired by our company and now you are formally an employee, Welcome!");
        notificationService.send(emailNotification);
    }
}
