package org.jspiders.springrestdataapi.service;

import jakarta.persistence.criteria.Order;
import org.jspiders.springrestdataapi.controller.CustomerController;
import org.jspiders.springrestdataapi.model.Customers;
import org.jspiders.springrestdataapi.model.Orders;
import org.jspiders.springrestdataapi.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

//    public void addCustomer(Customers c)
//    {
//      //  repository.save(c);
//    }
    public void addCustomer(Customers c){
        List<Customers> customers=new LinkedList<>();
        for(Orders o:c.getOrdersList())
        {
            o.setOrderNo(o.getOrderNo());
            o.setCartAmount(o.getCartAmount());
            o.setCustomerRef(c);
            customers.add(c);
        }
        repository.save(c);
    }

//   // public List<Object[]> getAllCustomers()
//    {
//        return repository.getAllCustomers();
//    }
//    public List<String> getCustomersPlaceMoreOrders(int count)
//    {
//        return repository.getCustomersPlaceMoreOrders(count);
//    }

//    public List<Object> getAllCustomersNameWithTotalCost()
//    {
//        return repository.getAllCustomersNameWithTotalCost();
//    }

//    public List<Object[]> getCustomersPlacedOrdersMoreThanSpecificAmount(int count)
//    {
//        return repository.getCustomersPlacedOrdersMoreThanSpecificAmount(count);
//    }
}
