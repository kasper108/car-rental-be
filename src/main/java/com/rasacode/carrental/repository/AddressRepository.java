package com.rasacode.carrental.repository;

import com.rasacode.carrental.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AddressRepository extends JpaRepository<Address, Long> {
    void deleteAddressById(Long id);
    Optional<Address> findAddressById(Long id);
}
