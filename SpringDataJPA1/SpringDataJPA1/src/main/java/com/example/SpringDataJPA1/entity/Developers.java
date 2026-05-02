package com.example.SpringDataJPA1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Developers
{
    @Id
    private Integer id;

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String name;

    private String city;

    public Developers() {
        super();
    }

    public Developers(int id,String name,String city){
        this.id=id;
        this.name=name;
        this.city=city;

    }

    @Override
    public String toString() {
        return "Developers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
