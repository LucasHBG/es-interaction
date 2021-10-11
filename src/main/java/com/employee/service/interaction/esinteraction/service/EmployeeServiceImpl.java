package com.employee.service.interaction.esinteraction.service;

import java.util.List;
import java.util.Optional;

import com.employee.service.interaction.esinteraction.entity.Employee;
import com.employee.service.interaction.esinteraction.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LucasHBG
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void saveEmployee(Employee employee) {
        //Salva objeto empregado
        employeeRepository.save(employee);
    }

    @Override
    public void saveAllEmployees(List<Employee> employees) {
        // Salva lista de empregados
        employeeRepository.saveAll(employees);
    }

    @Override
    public List<Employee> getAllEmployees() {
        // Retorna todos os empregados do banco
        // adicionar paginação é mais eficiente nesse caso...
        return employeeRepository.findAll();
    }

    /**
     * Encontra usuário por ID 
     * 
     * @param id - número de identificação do usuário
     * @return <code> Optional<Employee> </code> object
     */
    @Override
    public Optional<Employee> findById(Long id) {
        
        return employeeRepository.findById(id);
    }

    /**
     * Encontra empregado por Nome 
     * 
     * @param name - Nome do Employee para procurar
     * @return <code> List<Employee> </code> object
     */
    @Override
    public List<Employee> findByFirstNameStartingWith(String name) {
        
        return employeeRepository.findByFirstNameStartingWith(name);
    }

}
