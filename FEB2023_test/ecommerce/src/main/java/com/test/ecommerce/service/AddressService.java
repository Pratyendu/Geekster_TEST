package com.test.ecommerce.service;

import com.test.ecommerce.model.Address;
import com.test.ecommerce.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;

    public int createAddress(Address address){
        addressRepository.save(address);
        return address.getUser().getUserId();
    }
}
