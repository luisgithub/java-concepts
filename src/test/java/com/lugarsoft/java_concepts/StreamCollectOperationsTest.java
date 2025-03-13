package com.lugarsoft.java_concepts;

import com.lugarsoft.java_concepts.domain.Employee;
import com.lugarsoft.java_concepts.stream.StreamCollectOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;


@SpringBootTest
public class StreamCollectOperationsTest {
    @Autowired
    private StreamCollectOperations streamCollectOperations;

    @Test
    void print_full_employee_list(){
        streamCollectOperations.listEmployees().forEach(System.out::println);
    }

    @Test
    void print_grouped_by_city(){
        Map<String, Set<String>> employeesMap = streamCollectOperations.groupEmployeesByCity();
        Set<String> fromReno = employeesMap.get("Reno");
        Set<String> fromBoston = employeesMap.get("Boston");
        Set<String> fromPhoenix = employeesMap.get("Phoenix");
        boolean existe = false;
        if(!ObjectUtils.isEmpty(fromReno)) {
            System.out.println(">> From Reno:");
            fromReno.forEach(System.out::println);
            existe = true;
        }
        if(!ObjectUtils.isEmpty(fromBoston)) {
            System.out.println(">> From Boston:");
            fromBoston.forEach(System.out::println);
            existe = true;
        }
        if(!ObjectUtils.isEmpty(fromPhoenix)) {
            System.out.println(">> From Phoenix:");
            fromPhoenix.forEach(System.out::println);
            existe = true;
        }
        Assertions.assertTrue(existe);
    }

    @Test
    void print_avg_from_employee_age_double(){
        double avg = streamCollectOperations.calculateAverageInAgeAsDouble();
        System.out.println("Age average is: " + avg);
        Assertions.assertTrue(avg > 0);
    }

    @Test
    void print_avg_from_employee_age_int(){
        double avg = streamCollectOperations.calculateAverageInAgeAsInt();
        System.out.println("Age average is: " + avg);
        Assertions.assertTrue(avg > 0);
    }

    @Test
    void print_oldest_employee(){
        Optional<Employee> employee = streamCollectOperations.getOldestEmployee();
        System.out.println("Oldest employee in list is: " + employee.toString());
        Assertions.assertFalse(employee.isEmpty());

    }

    @Test
    void print_youngest_employee(){
        Optional<Employee> youngest = streamCollectOperations.getYoungestEmployee();
        youngest.ifPresent(employee -> System.out.println("Youngest employee in list is: " + employee));
        Assertions.assertFalse(youngest.isEmpty());
    }

    @Test
    void print_employees_partitioned_by_city(){
        Map<Boolean, List<Employee>> employeesPartition = streamCollectOperations.getEmployeeesPartitionedByCity();
        Assertions.assertNotNull(employeesPartition);
    }

    @Test
    void print_reduced_map_from_employee_list() {
        Map<Integer,Object> employeesMap = streamCollectOperations.convertEmployeeListToReducedMap();
        for(Map.Entry<Integer, Object> entry: employeesMap.entrySet()){
            System.out.println("key: " + entry.getKey()+ ", value: " + entry.getValue());
        }
        Assertions.assertNotNull(employeesMap);
    }


}
