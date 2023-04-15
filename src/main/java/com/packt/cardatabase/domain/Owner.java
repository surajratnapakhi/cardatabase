package com.packt.cardatabase.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Owner {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ownerid;
    private String firstname, lastname;

    public String getFirstname() {
        return firstname;
    }
    public long getOwnerid() 
    {
        return ownerid;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setOwnerid(long ownerid) {
        this.ownerid = ownerid;
    }
    public Owner(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public Owner() {
    }
}
