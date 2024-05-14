package net.javaproject.example.service;

import net.javaproject.example.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee saveEmployee(Employee employee);

    void deleteEmployee(Long id);
    Employee updateEmployee(Long id,Employee employee);
}
