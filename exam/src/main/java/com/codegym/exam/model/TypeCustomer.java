package com.codegym.exam.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "typeCustomer")
public class TypeCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @OneToMany(targetEntity = Customer.class)
    private List<Customer> customers;

    public TypeCustomer() {
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
