package com.packt.cardatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.packt.cardatabase.domain.Car;
import com.packt.cardatabase.domain.CarRepository;
import com.packt.cardatabase.domain.Owner;
import com.packt.cardatabase.domain.OwnerRepository;

@SpringBootApplication
public class CardatabaseApplication {

	@Autowired
	private CarRepository repository;

	@Autowired
	private OwnerRepository oRepository;

	@Autowired
	CarRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(){
		return args -> {
		// Save demo data to database
		repository.save(new Car("Ford", "Mustang", "Red",
		"ADF-1121", 2017, 59000));
		repository.save(new Car("Nissan", "Leaf", "White",
		"SSJ-3002", 2014, 29000));
		repository.save(new Car("Toyota", "Prius", "Silver",
		"KKO-0212", 2018, 39000));
		};
	};
}
