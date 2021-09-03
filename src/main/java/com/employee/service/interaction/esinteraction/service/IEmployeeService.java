package com.employee.service.interaction.esinteraction.service;

import java.util.List;

import com.employee.service.interaction.esinteraction.entity.Employee;

public interface IEmployeeService {
    
    void insertEmployee(Employee employee);
    void insertEmployees(List<Employee> employees);
    void getAllEmployees();
    void getEmployeeById(Long id);

}
