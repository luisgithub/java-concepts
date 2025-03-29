package utils;

import com.github.javafaker.Faker;
import com.lugarsoft.java_concepts.domain.Employee;
import com.lugarsoft.java_concepts.domain.EmployeeType;
import com.lugarsoft.java_concepts.solid.openclose.SalariedFullTime;
import com.lugarsoft.java_concepts.solid.openclose.SalariedPartTime;

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
            emp.setSalary(90d);
            double mod = c%2;
            emp.setEmployeeType(mod == 0d ? EmployeeType.FULL_TIME: EmployeeType.PARTIAL_TIME);
            if(emp.getEmployeeType().equals(EmployeeType.FULL_TIME)){
                emp.setPayCalculator(new SalariedFullTime());
            } else {
                emp.setPayCalculator(new SalariedPartTime(new Random().nextDouble(5d,20d), new Random().nextDouble(45d, 85d)));
            }
            employees.add(emp);
        }
        return employees;
    }
}
