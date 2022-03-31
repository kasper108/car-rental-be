package com.rasacode.carrental.controller;

import com.rasacode.carrental.model.Address;
import com.rasacode.carrental.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/address")
public class AddressController {
    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Address>> getAllAddresses(){
        List<Address> addresses = addressService.findAllAddresses();
        return new ResponseEntity<>(addresses, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable("id") Long id){
        Address address = addressService.findAddressById(id);
        return new ResponseEntity<>(address, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Address> addUser(@RequestBody Address address){
        Address newAddress = addressService.addAddress(address);
        return new ResponseEntity<>(newAddress, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Address> updateAddress(@RequestBody Address address){
        Address updateAddress = addressService.updateAddress(address);
        return new ResponseEntity<>(updateAddress, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> updateAddress(@PathVariable("id") Long id){
        addressService.deleteAddress(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
