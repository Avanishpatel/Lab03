package com.solstice.ecommerce.service;

import com.solstice.ecommerce.model.Address;
import com.solstice.ecommerce.model.Shipment;
import com.solstice.ecommerce.repository.AddressRepository;
import com.solstice.ecommerce.repository.ShipmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShipmentService {

    private ShipmentRepository shipmentRepository;
    private AddressRepository addressRepository;

    public ShipmentService(ShipmentRepository shipmentRepository, AddressRepository addressRepository) {
        this.shipmentRepository = shipmentRepository;
        this.addressRepository = addressRepository;
    }


    public void addShipment(long id, Shipment shipment) {

        shipment.setShippingAddress(addressRepository.getOne(id));

        shipmentRepository.save(shipment);
    }

    public Optional<Shipment> getShipmentById(long id) {

        return shipmentRepository.findById(id);
    }

    public void updateShipment(Long id, Shipment shipment) {

        shipmentRepository.save(shipment);
    }

    public void deleteShipmentById(long id) {

        shipmentRepository.deleteById(id);
    }

    public List<Shipment> getAllShipment() {

        return shipmentRepository.findAll();
    }
}
