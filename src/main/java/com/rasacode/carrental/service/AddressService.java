package com.rasacode.carrental.service;

import com.rasacode.carrental.exception.AddressNotFoundException;
import com.rasacode.carrental.model.Address;
import com.rasacode.carrental.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AddressService {
    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Address addAddress(Address address){
        return addressRepository.save(address);
    }

    public List<Address> findAllAddresses(){
        return addressRepository.findAll();
    }

    public Address updateAddress(Address address){
        return addressRepository.save(address);
    }

    public void deleteAddress(Long id){
        addressRepository.deleteAddressById(id);
    }

    public Address findAddressById(Long id){
        return addressRepository.findAddressById(id).
                orElseThrow(() -> new AddressNotFoundException("Address by id " + id + " was not found" ));
    }
}

