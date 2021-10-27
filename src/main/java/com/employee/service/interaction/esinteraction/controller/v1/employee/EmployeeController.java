package com.employee.service.interaction.esinteraction.controller.v1.employee;

import java.util.List;

import com.employee.service.interaction.esinteraction.entity.Employee;
import com.employee.service.interaction.esinteraction.service.IEmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LucasHBG
 */
@RestController //Combina as anotações @ResponseBody e @Controller para não repetir a anoatação em todos os métodos
@RequestMapping(path = "/v1/employees")
public class EmployeeController {

    @Autowired //Anotação responsável por chamar o bean employeeService 
    private IEmployeeService employeeService;

    /**
     * Método que retorna todos os Employees do banco de dados  
     * 
     * @return lista de Employees existentes 
     */
    @GetMapping
    public List<Employee> listEmployee() {

        return employeeService.getAllEmployees();
    }

    /**
     * Método de busca que retorna nome de usuários
     * 
     * @param name - Nome do Employee para procurar
     * @return objeto(s) do tipo Employee
     */
    @GetMapping("/findByFirstName/{name}")
    public List<Employee> findByFirstName(@PathVariable("name") String name){

        return employeeService.findByFirstNameStartingWith(name);
    }

    /**
     * Método que retorna o usuário pelo ID
     * 
     * @param id - numero de identificacao do usuário
     * @return objeto do tipo Employee ou erro
     */
    public Employee findById(@PathVariable("id") Long id){

        return employeeService.findById(id).orElseThrow();
    }

    /**
     * Salvar entidade no banco de dados
     * 
     * @param employee - objeto classe Employee para salvar
     * @return String com mensagem de sucesso ou erro.
     */
    @PostMapping("/save")
    public String saveEmployee(@Validated @RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return "Usuário salvo com sucesso";
    }

    /**
     * 
     * @param employees - lista de objetos classe Employee para salvar
     * @return String com mensagem de sucesso ou erro.
     */
    @PostMapping("/saveAll")
    public String saveAllEmployee(@Validated @RequestBody List<Employee> employees){
        employeeService.saveAllEmployees(employees);
        return "Usuários salvos com sucesso";
    }
}
