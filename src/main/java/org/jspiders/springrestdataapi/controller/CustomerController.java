package org.jspiders.springrestdataapi.controller;

import org.jspiders.springrestdataapi.model.Customers;
import org.jspiders.springrestdataapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping("/add")
    public void addCustomer(@RequestBody Customers c)
    {
         service.addCustomer(c);
    }

//    @GetMapping("/get-all-customers")
//    public List<Object[]> getAllCustomers()
//    {
//        return service.getAllCustomers();
//    }

//    @GetMapping("/get-all-customers1/{count}")
//    public List<String> getCustomersPlaceMoreOrders(@PathVariable(value = "count") int count)
//    {
//        return service.getCustomersPlaceMoreOrders(count);
//    }

//    @GetMapping("get-all-customers2")
//    public List<Object> getAllCustomersNameWithTotalCost()
//    {
//        return service.getAllCustomersNameWithTotalCost();
//    }

//    @GetMapping("/getcustomers/{amount}")
//    public List<Object[]> getCustomersPlacedOrdersMoreThanSpecificAmount(@PathVariable(value = "amount") int count)
//    {
//        return service.getCustomersPlacedOrdersMoreThanSpecificAmount(count);
//    }
}
