package com.rasacode.carrental.controller;

import com.rasacode.carrental.model.Car;
import com.rasacode.carrental.service.CarService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/api/v1/")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public ResponseEntity<List<Car>> getAllCars(){
        List<Car> cars = carService.findAllCars();
        return new ResponseEntity<>(cars, HttpStatus.OK);
    }

    @GetMapping("/cars/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable("id") Long id){
        Car car = carService.findCarById(id);
        return new ResponseEntity<>(car, HttpStatus.OK);
    }

    @PostMapping("/cars")
    public ResponseEntity<Car> addCar(@RequestBody Car car){
        Car newCar = carService.addCar(car);
        return new ResponseEntity<>(newCar, HttpStatus.CREATED);
    }

    @PutMapping("/cars/{id}")
    public ResponseEntity<Car> updateCar(@RequestBody Car carInfo){
        Car updateCar = carService.updateCar(carInfo);
        return new ResponseEntity<>(updateCar, HttpStatus.OK);
    }

    @DeleteMapping("/cars/{id}")
    public ResponseEntity<?> deleteCar(@PathVariable("id") Long id){
        carService.deleteCar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

