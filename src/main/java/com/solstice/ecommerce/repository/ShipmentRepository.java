package com.solstice.ecommerce.repository;

import com.solstice.ecommerce.model.Shipment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShipmentRepository extends CrudRepository<Shipment, Long> {

}
