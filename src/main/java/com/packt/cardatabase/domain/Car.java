package com.packt.cardatabase.domain;
import java.lang.reflect.Constructor;

import org.yaml.snakeyaml.constructor.Construct;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Car
{
    @Id
    @GeneratedValue
    private long idc;

    private String brand, model, color, registerNumber;
    private int year, price;
}
