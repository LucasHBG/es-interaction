package com.employee.service.interaction.esinteraction.repository;

import com.employee.service.interaction.esinteraction.entity.Employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
    
}
