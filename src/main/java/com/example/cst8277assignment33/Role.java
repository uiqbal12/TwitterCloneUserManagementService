package com.example.cst8277assignment33;


import javax.persistence.*;

@Entity
@Table(name= "roles")
public class Role {
/* Id annotan needed to make use of CRUD repository off the shelf methods and make data retrieval more stream lined */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;


// make the getters and setters using spring boot


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
