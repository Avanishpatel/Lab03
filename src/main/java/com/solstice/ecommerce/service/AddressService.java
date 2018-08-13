package com.solstice.ecommerce.service;

import com.solstice.ecommerce.model.Address;
import com.solstice.ecommerce.repository.AddressRepository;

public class AddressService {

    private AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Address getAddressById(long id) {

        return addressRepository.getOne(id);
    }
}
