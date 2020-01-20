package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BuddyInfo {

    @Id
    @GeneratedValue
    private int id;
    private int phNumber;
    private String name;
    private String address;


    public BuddyInfo() {
        this.name = "Aly Khan";
        this.phNumber = 647;
        this.address = "TBD";

    }

    public BuddyInfo(String name, int phNumber, String address) {
        this.name = name;
        this.phNumber = phNumber;
        this.address= address;
    }
    public String getAddress() {
        return address;
    }

    public int getPhNumber() {
        return phNumber;
    }
f
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhNumber(int phNumber) {
        this.phNumber = phNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
