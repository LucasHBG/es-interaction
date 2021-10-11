package com.employee.service.interaction.esinteraction.service;

import java.util.List;
import java.util.Optional;

import com.employee.service.interaction.esinteraction.entity.Employee;

/**
 * @author LucasHBG
 */
public interface IEmployeeService {
    
    void saveEmployee(Employee employee);
    void saveAllEmployees(List<Employee> employees);
    List<Employee> getAllEmployees();
    
    Optional<Employee> findById(Long id);

    /**
     * O sufixo 'StartWith' é um mecanismo de pesquisa próprio do spring jpa
     * 
     * */ 
    List<Employee> findByFirstNameStartingWith(String name);

}
