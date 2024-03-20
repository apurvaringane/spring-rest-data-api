package org.jspiders.springrestdataapi.repository;

import org.jspiders.springrestdataapi.model.Address;
import org.jspiders.springrestdataapi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {

    //get person by city
    @Query("select p from Person p where p.address.city=:city")
    List<Person> getPersonByCity(@Param("city") String city);

    //display city name along with total no of people living there
    //@Query("select p.address.city,COUNT(p) from Person p")
    //@Query("select COUNT(p) from Person p GROUP BY p.address.city")
    @Query("select a.city,COUNT(p) from Person p join p.address a group by city")
    List<Object[]> getCityWithTotalCountOfPeople();

    //accept city name from user and display total no of people
    @Query("select COUNT(p) from Person p JOIN p.address a where a.city=:city")
    int getTotalNumberOfPeople(@Param("city") String city);
}
