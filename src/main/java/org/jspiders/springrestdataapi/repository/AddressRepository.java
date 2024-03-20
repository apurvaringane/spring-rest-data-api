package org.jspiders.springrestdataapi.repository;

import org.jspiders.springrestdataapi.model.Address;
import org.jspiders.springrestdataapi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {


    //List<Address> readByCity(String city);
}
