package org.jspiders.springrestdataapi.repository;

import org.jspiders.springrestdataapi.model.Customers;
import org.jspiders.springrestdataapi.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customers,Integer> {
    //get all customers
//    @Query("select c.customerName,o.orderNo,o.cartAmount from Customers c Join c.orderList o")
//    List<Object[]> getAllCustomers();

    //display customers those who have placed more than specified no of orders
//    @Query("select c.customerName,count(c) from Customers c join c.orderList o group by o.customerRef having count(c)>:count")
//    List<String> getCustomersPlaceMoreOrders(@Param("count") int count);

    //display all customers name along with total cost of orders.
//    @Query("select c.customerName,sum(o.cartAmount) from Customers c join c.orderList o group by c.customerName")
//    List<Object> getAllCustomersNameWithTotalCost();

    //display customers those who have placed order more than specified amount
//    @Query("select c.customerName,sum(o.cartAmount) from Customers c join c.orderList o having count(c)>:count")
//    List<Object[]> getCustomersPlacedOrdersMoreThanSpecificAmount(@Param("count") int count);

    //display all customer along with their avg purchase having age group between specified range
//    @Query("select c.customerName,avg(o.cartAmount) from Customers c join c.orderList o where c.customerAge between :start and :end group by c.customferName")
//    List<Object[]> getCustomersAvgPurchase(@Param("start") int start,@Param("end") int end);

}
