package org.jspiders.springrestdataapi.controller;

import org.jspiders.springrestdataapi.model.Address;
import org.jspiders.springrestdataapi.model.Person;
import org.jspiders.springrestdataapi.payload.PersonInfo;
import org.jspiders.springrestdataapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService service;

    @PostMapping("/addperson")
    public void addPersonInfo(@RequestBody PersonInfo info)
    {
        service.addPersonInfo(info);
    }

    @GetMapping("/getusers")
    public List<Person> getAllUsers()
    {
        return service.getAllUsers();
    }

    @GetMapping("/findbyid/{id}")
    public Person getPersonById(@PathVariable int id)
    {
        return service.getPersonById(id);
    }

    @GetMapping("/getpersonbycity/{city}")
    public List<Person> getPersonByCity(@PathVariable(value = "city") String city)
    {
       return service.getPersonByCity(city);
    }

    @GetMapping("/getcitywithtotalcountpeople")
    public List<Object[]> getCityWithTotalCountOfPeople()
    {
        return service.getCityWithTotalCountOfPeople();
    }

    @GetMapping("/gettoalnumberofpeople/{cityname}")
    public int getTotalNumberOfPeople(@PathVariable(value = "cityname") String city)
    {
        return service.getTotalNumberOfPeople(city);
    }
}