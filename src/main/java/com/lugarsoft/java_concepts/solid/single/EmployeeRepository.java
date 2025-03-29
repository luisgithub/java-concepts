package com.lugarsoft.java_concepts.solid.single;

import com.lugarsoft.java_concepts.domain.Employee;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class EmployeeRepository {
    /**
     * This class has the single responsibility of interacting with employee storage
     * **/

    private static final Map<Long, Employee> storage = new HashMap<>();

    public void save(Employee emp){
        synchronized (storage) {
            storage.put(emp.getId(), emp);
        }
    }

    public Optional<Employee> findEmployee(Long id){
        synchronized (storage) {
            return Optional.of(storage.get(id));
        }
    }
}
