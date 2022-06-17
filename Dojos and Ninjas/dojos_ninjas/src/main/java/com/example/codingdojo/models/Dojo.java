package com.example.codingdojo.models;
//package com.codingdojo.mvc.models;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="dojos")
public class Dojo {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    Setting validation for name field, min & max char
    @NotNull
    @Size(min = 5, max = 200)
    private String name;



    public void setNinjas(List<Ninja> ninjas) {
        this.ninjas = ninjas;
    }

    //    creating new collumn created at & updated at
    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;

    @OneToMany(mappedBy = "dojo", fetch =  FetchType.LAZY)
    private List<Ninja> ninjas;
    public Dojo() {
    }

    public Dojo(String name) {
        this.name = name;
    }

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

//Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Ninja> getNinjas() {
        return ninjas;
    }
}
