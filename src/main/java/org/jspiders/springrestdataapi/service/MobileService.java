package org.jspiders.springrestdataapi.service;

import org.jspiders.springrestdataapi.model.Mobile;
import org.jspiders.springrestdataapi.repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobileService {
    @Autowired
    private MobileRepository repository;
    public List<Mobile> getAllMobiles()
    {
        List<Mobile> mobiles=repository.findAll();
        return mobiles;
    }
    public void addNewMobile(Mobile m){
        repository.save(m);
    }

    public Mobile getMobileById(int id){
        return repository.findById(id).orElse(null);
    }

    public void updateMobile(Mobile m){
        repository.save(m);
    }

    public void deleteMobile(int id){
        repository.deleteById(id);
    }

    public Mobile findByModelName(String name){
        return repository.findByModelName(name);
    }

//    public Mobile findByCompanyName(String cName){
//        return repository.findByCompanyName(cName);
//    }

//    public List<Mobile> findByCompanyName(String name){
//        return repository.readByCompanyName(name);
//    }
//

    public List<Mobile> readByCompanyName(String name){
        return repository.readByCompanyName(name);
    }


    public List<Mobile> findByModelNameAndCompanyName(String model,String company)
    {
        return repository.findByModelNameAndCompanyName(model,company);
    }

    public List<Mobile> findModelPriceGreaterThan(double price){
        return repository.findByModelPriceGreaterThan(price);
    }

    public Mobile findFirstByCompanyName(String name){
        return repository.findFirstByCompanyName(name);
    }

    public Mobile findFirst3ByCompanyName(String name){
        return repository.findFirst3ByCompanyName(name);
    }

    public List<Mobile> findModelPriceLessThan(double price){
        return repository.findByModelPriceLessThan(price);
    }

    public List<String> getAllModel(){
       return repository.getAllModel();
    }

    public List<String> getAllCompany()
    {
        return repository.getAllCompany();
    }

    public List<String> getAllModelByCompany(String company)
    {
        return repository.getModelsByCompany(company);
    }

    public List<Mobile> getModelNameBySpecifiedCharSeq(String charSeq)
    {
        return repository.getModelNameBySpecifiedCharSeq(charSeq);
    }

    public List<Mobile> getMobileBelowSpecificPrice(String model,double price)
    {
        return repository.getMobileBelowSpecificPrice(model,price);
    }

    public int deleteMobiles(int count)
    {
        return repository.deleteMobiles(count);
    }
}
