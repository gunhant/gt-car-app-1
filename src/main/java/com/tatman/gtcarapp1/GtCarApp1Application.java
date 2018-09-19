package com.tatman.gtcarapp1;

import com.tatman.gtcarapp1.domain.Car;
import com.tatman.gtcarapp1.domain.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GtCarApp1Application {

	@Autowired
	private CarRepository carRepository;

	public static void main(String[] args) {
		SpringApplication.run(GtCarApp1Application.class, args);
	}

	@Bean
	CommandLineRunner runner()	{
		return args -> {
				carRepository.save(new Car("Ford", "Mustang", "Red", "ADF-1111", 2015, 5000));
		carRepository.save(new Car("Nissan", "Sentra", "White", "ADF-2222", 2016, 6000));
		carRepository.save(new Car("Mazda", "Miata", "Blue", "ADF-3333", 2017, 7000));
		};
	}
}
