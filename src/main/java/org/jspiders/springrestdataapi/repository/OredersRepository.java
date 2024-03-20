package org.jspiders.springrestdataapi.repository;

import org.jspiders.springrestdataapi.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OredersRepository extends JpaRepository<Orders,Integer> {
}
