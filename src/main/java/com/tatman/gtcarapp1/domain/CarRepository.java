package com.tatman.gtcarapp1.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {

    List<Car> findByColor(String color);

    List<Car> findByBrand(String brand);


}
