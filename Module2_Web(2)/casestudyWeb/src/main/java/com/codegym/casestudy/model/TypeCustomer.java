package com.codegym.casestudy.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "type_customer")
public class TypeCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_customer")
    private long id;

    @Column(name = "type_customer")
    private String name;

    @OneToMany(targetEntity = Customer.class)
    private List<Customer> customers;

    public TypeCustomer() {
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

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
