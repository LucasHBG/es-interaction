package com.employee.service.interaction.esinteraction.repository;

import java.util.List;

import com.employee.service.interaction.esinteraction.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Escolhi JPA no lugar do CRUD devido o Jpa retornar List<> no lugar de
 * Iterable<S>
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByFirstNameStartingWith(String name);

}
