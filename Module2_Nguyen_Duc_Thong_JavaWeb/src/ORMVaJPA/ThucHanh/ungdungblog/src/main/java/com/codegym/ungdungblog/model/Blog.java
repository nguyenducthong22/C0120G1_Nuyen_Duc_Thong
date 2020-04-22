package com.codegym.ungdungblog.model;

import javax.persistence.*;

@Entity
@Table(name = "blogs")
public class Blog {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String pepperthreads;
    private String content;

    public Blog() {}

    public Blog(String pepperthreads, String content) {
        this.pepperthreads = pepperthreads;
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format("Blog[id=%d, pepperthreads='%s', content='%s']", id, pepperthreads, content);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPepperthreads() {
        return pepperthreads;
    }

    public void setPepperthreads(String firstName) {
        this.pepperthreads = firstName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String lastName) {
        this.content = lastName;
    }
}