package org.jspiders.springrestdataapi.controller;

import org.jspiders.springrestdataapi.model.Orders;
import org.jspiders.springrestdataapi.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrdersController {
    @Autowired
    private OrdersService service;

    @PostMapping("/add")
    public void addOrders(Orders o)
    {
        service.addOrders(o);
    }


}
