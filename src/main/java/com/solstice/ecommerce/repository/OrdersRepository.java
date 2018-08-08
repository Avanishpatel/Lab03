package com.solstice.ecommerce.repository;

import com.solstice.ecommerce.model.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface OrdersRepository extends CrudRepository<Orders, Long> {

}
