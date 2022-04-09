package com.rasacode.carrental.service;

import com.rasacode.carrental.exception.CarNotFoundException;
import com.rasacode.carrental.model.Car;
import com.rasacode.carrental.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car addCar(Car car){
        return carRepository.save(car);
    }

    public List<Car> findAllCars(){
        return carRepository.findAll();
    }

    public Car updateCar(Car carInfo){
        Car car = carRepository.findCarById(carInfo.getId())
                .orElseThrow(() -> new CarNotFoundException("Car by id " + carInfo.getId() + " was not found" ));

        car.setRegCode(carInfo.getRegCode());
        car.setBrand(carInfo.getBrand());
        car.setDayPrice(carInfo.getDayPrice());
        car.setFuelType(carInfo.getFuelType());
        car.setSitCount(carInfo.getSitCount());
        car.setTransmission(carInfo.getTransmission());
        car.setYear(carInfo.getYear());

        Car updatedCar = carRepository.save(car);

        return carRepository.save(car);
    }

    public void deleteCar(Long id){
        carRepository.deleteCarById(id);
    }

    public Car findCarById(Long id){
        return carRepository.findCarById(id)
                .orElseThrow(() -> new CarNotFoundException("Car by id " + id + " was not found" ));
    }
}

