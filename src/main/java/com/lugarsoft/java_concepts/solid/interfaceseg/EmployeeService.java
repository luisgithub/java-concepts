package com.lugarsoft.java_concepts.solid.interfaceseg;

import com.lugarsoft.java_concepts.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class EmployeeService implements PersistenceService<Employee> {

    private final Map<Long, Employee> data = new HashMap<>();
    @Override
    public Employee save(Employee employee) {
        data.put(employee.getId(), employee);
        return employee;
    }

    @Override
    public Employee get(Long id) {
        return data.get(id);
    }

    @Override
    public void delete(Long id) {
        data.remove(id);
    }

    public Optional<Employee> findByFirstName(String firstName){
        return data.values().stream().filter(item -> item.getFirstName().equals(firstName)).findFirst();
    }
}
