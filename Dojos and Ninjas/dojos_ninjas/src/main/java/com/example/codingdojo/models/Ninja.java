package com.example.codingdojo.models;
import org.springframework.format.annotation.DateTimeFormat;
//import javax.persistence.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Ninja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    private String firstName;
//    private String lastName;
//    private int age;
    //    creating new column created at & updated at
    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;

//    One to many creation
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dojo_id")
    private Dojo dojo;

    public Ninja() {

    }

    @NotNull
    @Size(min = 3, max = 200)
    private String firstName;

    @NotNull
    @Size(min = 3, max = 200)
    private String lastName;

    @NotNull
    @Min(value=1)
    private int age;

    //    Runs this method when row is created
    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }
    //    runs this methos when row is updated
    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Dojo getDojo() {
        return dojo;
    }

    public void setDojo(Dojo dojo) {
        this.dojo = dojo;
    }
}


