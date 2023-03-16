package com.packt.cardatabase.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Car
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String brand, model, color, registerNumber;
    private int year, price;
}
