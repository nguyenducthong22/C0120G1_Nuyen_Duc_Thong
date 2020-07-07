package com.codegym.student.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "classification")
public class Classification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_classification")
    private long id;

    @Column(name = "name")
    private String name;

    @OneToMany(targetEntity = Student.class)
    private List<Student> students;

    public Classification() {
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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
