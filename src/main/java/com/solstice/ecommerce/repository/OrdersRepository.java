package com.solstice.ecommerce.repository;

import com.solstice.ecommerce.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders,Long> {
}
