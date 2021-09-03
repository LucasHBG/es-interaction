package com.employee.service.interaction.esinteraction.service;

import java.util.List;

import com.employee.service.interaction.esinteraction.entity.Employee;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    
    void insertEmployee(Employee employee);
    void insertEmployees(List<Employee> employees);
    void getAllEmployees();
    void getEmployeeByNum(Long id);

}
