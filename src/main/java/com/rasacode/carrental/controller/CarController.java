package com.rasacode.carrental.controller;

import com.rasacode.carrental.model.Car;
import com.rasacode.carrental.service.CarService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/car")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Car>> getAllCars(){
        List<Car> cars = carService.findAllCars();
        return new ResponseEntity<>(cars, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Car> getUserById(@PathVariable("id") Long id){
        Car car = carService.findCarById(id);
        return new ResponseEntity<>(car, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Car> addUser(@RequestBody Car car){
        Car newCar = carService.addCar(car);
        return new ResponseEntity<>(newCar, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Car> updateUser(@RequestBody Car car){
        Car updateCar = carService.updateCar(car);
        return new ResponseEntity<>(updateCar, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> updateUser(@PathVariable("id") Long id){
        carService.deleteCar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

