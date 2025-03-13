package utils;

import com.github.javafaker.Faker;
import com.lugarsoft.java_concepts.domain.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeUtils {
    private static final Faker faker = new Faker();
    private static final String[] cities = {"Phoenix","Boston", "Reno"};
    public static List<Employee> generateEmployeeList(Long listSize){
        List<Employee> employees = new ArrayList<>();
        for(Long c = 0L; c<= listSize; c++){
            Employee emp = new Employee();
            emp.setId(c);
            emp.setFirstName(faker.name().firstName());
            emp.setLastName(faker.name().lastName());
            emp.setEmail(faker.internet().emailAddress());
            emp.setCity(cities[new Random().nextInt(0,2)]);
            emp.setAge(new Random().nextInt(15, 55));
            employees.add(emp);
        }
        return employees;
    }
}
