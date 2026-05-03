package com.example.LayeredApproach.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Electronics
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String gadgetname;

    private String brandName;

    private double cost;

    public Electronics(double cost, String gadgetname, String brandName) {
        this.cost = cost;
        this.gadgetname = gadgetname;
        this.brandName = brandName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGadgetname() {
        return gadgetname;
    }

    public void setGadgetname(String gadgetname) {
        this.gadgetname = gadgetname;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "id=" + id +
                ", gadgetname='" + gadgetname + '\'' +
                ", brandName='" + brandName + '\'' +
                ", cost=" + cost +
                '}';
    }
}
