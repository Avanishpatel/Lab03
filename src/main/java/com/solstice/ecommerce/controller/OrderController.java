package com.solstice.ecommerce.controller;

import com.solstice.ecommerce.model.Account;
import com.solstice.ecommerce.model.Orders;
import com.solstice.ecommerce.service.OrdersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    private OrdersService ordersService;

    public OrderController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping()
    public List<Orders> getAllOrders() {

        return ordersService.getAllOrders();
    }

    @PostMapping()
    public String addOrder(@RequestBody Orders orders) {

        ordersService.addOrders(orders);
        return "Order is created.";
    }

    @GetMapping("/{id}")
    public Optional<Orders> getOrderById(@PathVariable("id") long id) {

        return ordersService.getOrderById(id);
    }

    @PutMapping("/{id}")
    public String updateOrderbyId(@PathVariable("id") Long id, @RequestBody Orders orders) {

        ordersService.updateOrderById(id, orders);
        return "Order is updated.";
    }

    @DeleteMapping("/{id}")
    public String deleteOrderById(@PathVariable("id") long id) {

        ordersService.deleteOrderById(id);

        return "Order with order number " + id + " successfully deleted.";
    }

}
