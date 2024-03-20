package org.jspiders.springrestdataapi.service;

import org.jspiders.springrestdataapi.model.Orders;
import org.jspiders.springrestdataapi.repository.OredersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {
    @Autowired
    private OredersRepository repository;


    public void addOrders(Orders o)
    {
        repository.save(o);
    }
}
