package org.jspiders.springrestdataapi.service;

import org.jspiders.springrestdataapi.model.Address;
import org.jspiders.springrestdataapi.model.Person;
import org.jspiders.springrestdataapi.payload.PersonInfo;
import org.jspiders.springrestdataapi.repository.AddressRepository;
import org.jspiders.springrestdataapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    PersonRepository personRepository;

    public void addPersonInfo(PersonInfo info)
    {
        Address a1=new Address();
        a1.setCity(info.getCity());
        a1.setPinCode(info.getPinCode());

        Person person=new Person();
        person.setPersonName(info.getPersonName());
        person.setAddress(a1);

        personRepository.save(person);
    }

    public List<Person> getAllUsers()
    {
        return personRepository.findAll();
    }

    //get person by id
    public Person getPersonById(int id)
    {
        return personRepository.findById(id).orElse(null);
    }

    public List<Person> getPersonByCity(String city)
    {
        return personRepository.getPersonByCity(city);
    }

    public List<Object[]> getCityWithTotalCountOfPeople()
    {
        return personRepository.getCityWithTotalCountOfPeople();
    }

    public int getTotalNumberOfPeople(String city)
    {
        return personRepository.getTotalNumberOfPeople(city);
    }
}
