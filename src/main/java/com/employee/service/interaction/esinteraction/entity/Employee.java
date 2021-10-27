package com.employee.service.interaction.esinteraction.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.employee.service.interaction.esinteraction.utils.JsonDateSerializer;
import com.employee.service.interaction.esinteraction.utils.JsonDatetimeSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * A anotação '@Entity' avisa o Hibernate pra criar uma tabela dessa classe(usado em bancos embedded, como H2)
 * Serializable para transformar o objeto em um vetor de bytes para facilitar a comunicação, persistencia dos dados em
 * um banco de dados e a deserialização.
 * 
 * @author LucasHBG
 * 
 */
@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    /**
     * Anotação do spring para variáveis que se auto incrementam pela entidade de persistencia.
     * Deixar o Hibernate incrementar resulta numa melhor performance devido os mecanismos próprios de otimização
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long    id;
    
    @Column(nullable = false)
    private String  firstName;

    @Column(nullable = false)
    private String  lastName;

    @Column(nullable = true)
    private Date    birthDate;

    @Column(nullable = false)
    private String email;

    /**
     * Essa coluna é ignorada ao tentar fazer update ou inserts, pois é um valor que não precisa mudar
     */
    @Column(name = "created_datetime", updatable = false, insertable = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date    createdDatetime;

    /** 
     *    Construtor vazio para o JPA usar. Não se deve utilizá-lo diretamente.
     *    Assim como proposto na documentação do Spring Boot
     *    Fonte: https://spring.io/guides/gs/accessing-data-jpa/
     */ 
    protected Employee() {}

    public Employee(Long id, String firstName, String lastName, Date birthDate, String email, Date createdDatetime) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.createdDatetime = createdDatetime;
    }

    @JsonIgnore
    public Long getId() {
        return id;
    }

    public void setEmployeeNum(Long id) {
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    @JsonSerialize(using = JsonDateSerializer.class)
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @JsonSerialize(using = JsonDatetimeSerializer.class)
    public Date getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

}
