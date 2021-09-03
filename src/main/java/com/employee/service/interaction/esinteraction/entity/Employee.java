package com.employee.service.interaction.esinteraction.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    private Long    employeeNum;
    
    private String  firstName;
    private Date    birthDate;
    private Date    createdDatetime;

    public Employee() {
        
    }

    public Employee(Long employeeNum, String firstName, Date birthDate, Date createdDatetime) {
        this.employeeNum = employeeNum;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.createdDatetime = createdDatetime;
    }

    public Long getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(Long employeeNum) {
        this.employeeNum = employeeNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
        result = prime * result + ((createdDatetime == null) ? 0 : createdDatetime.hashCode());
        result = prime * result + ((employeeNum == null) ? 0 : employeeNum.hashCode());
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (birthDate == null) {
            if (other.birthDate != null)
                return false;
        } else if (!birthDate.equals(other.birthDate))
            return false;
        if (createdDatetime == null) {
            if (other.createdDatetime != null)
                return false;
        } else if (!createdDatetime.equals(other.createdDatetime))
            return false;
        if (employeeNum == null) {
            if (other.employeeNum != null)
                return false;
        } else if (!employeeNum.equals(other.employeeNum))
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Employee [birthDate=" + birthDate + ", createdDatetime=" + createdDatetime + ", employeeNum="
                + employeeNum + ", firstName=" + firstName + "]";
    }

}
