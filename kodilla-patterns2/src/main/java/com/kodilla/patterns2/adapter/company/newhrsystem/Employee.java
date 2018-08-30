package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.Objects;

public class Employee {
    final private String firstname;
    final private String peselId;
    final private String lastname;
    final private BigDecimal baseSalary;

    public Employee(String firstname, String peselId, String lastname, BigDecimal baseSalary) {
        this.firstname = firstname;
        this.peselId = peselId;
        this.lastname = lastname;
        this.baseSalary = baseSalary;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getPeselId() {
        return peselId;
    }

    public String getLastname() {
        return lastname;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getFirstname(), employee.getFirstname()) &&
                Objects.equals(getPeselId(), employee.getPeselId()) &&
                Objects.equals(getLastname(), employee.getLastname()) &&
                Objects.equals(getBaseSalary(), employee.getBaseSalary());
    }

    @Override
    public int hashCode() {

        return peselId != null ? peselId.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", peselId='" + peselId + '\'' +
                ", lastname='" + lastname + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
