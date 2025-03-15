package com.lugarsoft.java_concepts;

import com.lugarsoft.java_concepts.domain.Employee;
import com.lugarsoft.java_concepts.stream.StreamOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import java.util.stream.Stream;


@SpringBootTest
public class StreamOperationsTest {

    @Autowired
    private StreamOperations streamOperations;


    @Test
    void all_employees_are_older_than_5(){
        boolean allMatches = streamOperations.allEmployeesAreOlderThan5();
        System.out.println("Are all employees alder than 5? " + allMatches);
        Assertions.assertTrue(allMatches);
    }

    @Test
    void no_employees_youger_than_5() {
        boolean noneMatch = streamOperations.anyEmployeeIsUnder5YearsOld();
        System.out.println("There is any employee under 5?" + noneMatch);
        Assertions.assertFalse(noneMatch);
    }

    @Test
    void find_first_item_in_stream(){
        Optional<Employee> employeeOptional = streamOperations.findFirstEmployee();
        employeeOptional.ifPresent(emp  -> System.out.println("The very first employee is: " + emp));
        Assertions.assertTrue(employeeOptional.isPresent());
    }

    @Test
    void find_any_item_in_stream(){
        Optional<Employee> employeeOptional = streamOperations.findAnyEmployee();
        employeeOptional.ifPresent(emp  -> System.out.println("Get any employee: " + emp));
        Assertions.assertTrue(employeeOptional.isPresent());
    }

    @Test
    void concatenate_two_streams(){
        Stream<Employee> employeeStream = streamOperations.concatenateTwoStreams();
        System.out.println("Total items in stream: " + employeeStream.count());
        Assertions.assertNotNull(employeeStream);
    }

    @Test
    void filter_employee_stream_by_city(){
        Stream<Employee> employeeStream = streamOperations.getFilteredEmployeesByCity();
        System.out.println("Employees:");
        employeeStream.forEach(System.out::println);
        Assertions.assertNotNull(employeeStream);
    }

}
