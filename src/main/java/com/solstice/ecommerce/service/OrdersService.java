package com.solstice.ecommerce.service;

import com.solstice.ecommerce.model.Account;
import com.solstice.ecommerce.model.Orders;
import com.solstice.ecommerce.repository.OrdersRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdersService {

    private OrdersRepository ordersRepository;

    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public List<Orders> getAllOrders(){

        return ordersRepository.findAll();
    }

    public void addOrders(Orders orders) {

        ordersRepository.save(orders);
    }

    public Optional<Orders> getOrderById(long id) {

        return ordersRepository.findById(id);
    }

    public void updateOrderById(Long id, Orders orders) {

        ordersRepository.save(orders);
    }

    public void deleteOrderById(long id) {

        ordersRepository.deleteById(id);
    }
}
