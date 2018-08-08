package com.solstice.ecommerce.repository;

import com.solstice.ecommerce.model.OrderLineItems;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderLineItemsRepository extends CrudRepository<OrderLineItems, Long> {

}
