package org.jspiders.springrestdataapi.controller;

import org.jspiders.springrestdataapi.model.Mobile;
import org.jspiders.springrestdataapi.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MobileController {
    @Autowired
    private MobileService service;

    @GetMapping("/mobiles")
    public List<Mobile> getAllMobiles(){
        return service.getAllMobiles();
    }

    @PostMapping("/mobiles")
    public void addNewMobile(@RequestBody Mobile mobile){
        service.addNewMobile(mobile);
    }

    @GetMapping("/mobiles/{id}")
    public Mobile getMobileById(@PathVariable(value = "id") int mobileId){
        return service.getMobileById(mobileId);
    }

    @PutMapping("/mobiles/{id}")
    public void updateMobile(@RequestBody Mobile mobile){
        service.updateMobile(mobile);
    }

    @DeleteMapping("/mobiles/{id}")
    public void deleteMobile(@PathVariable int id){
        service.deleteMobile(id);
    }

    @GetMapping("/findmodelname/{model}")
    public Mobile findByModelName(@PathVariable(value = "model") String name){
        return service.findByModelName(name);
    }

//    @GetMapping("/findcompanyname/{company}")
//    public Mobile findByCompanyName(@PathVariable(value = "company") String cName){
//        return service.findByCompanyName(cName);
//    }

//    @GetMapping("/findcompanyname/{company}")
//    public List<Mobile> findByCompanyName(@PathVariable(value = "company") String cName)
//    {
//        return service.findByCompanyName(cName);
//    }

    @GetMapping("/readcompanyname/{company}")
    public List<Mobile> readByCompanyName(@PathVariable(value = "company") String cName){
        return service.readByCompanyName(cName);
    }

    @GetMapping("/findbymodelcompany/{model}/{company}")
    public List<Mobile> findByModelNameAndComapnyName(@PathVariable String model,@PathVariable String company)
    {
        return service.findByModelNameAndCompanyName(model,company);
    }

    @GetMapping("/findmodelpricegreater/{value}")
    public List<Mobile> findModelPriceGreaterThan(@PathVariable(value = "value") double price){
        return service.findModelPriceGreaterThan(price);
    }

    @GetMapping("/findmodelpriceless/{price}")
    public List<Mobile> findModelPriceLessThan(@PathVariable(value = "price") double modelPrice){
        return service.findModelPriceLessThan(modelPrice);
    }

    @GetMapping("/findfirstbycompany/{company}")
    public Mobile findFirstByCompanyName(@PathVariable(value = "company") String name){
        return service.findFirstByCompanyName(name);
    }

    @GetMapping("/findfirstthreecompany/{com}")
    public Mobile findTopByCompanyName(@PathVariable String com){
        return service.findFirst3ByCompanyName(com);
    }

    @GetMapping("/getallmodel")
    public List<String> getAllModel(){
        return service.getAllModel();
    }

    @GetMapping("/getallcompany")
    public List<String> getAllCompany()
    {
        return service.getAllCompany();
    }

    @GetMapping("/getallmodelbycompany/{com}")
    public List<String> getAllModelByCompany(@PathVariable(value = "com") String company)
    {
        return service.getAllModelByCompany(company);
    }

    @GetMapping("/getmodelbyspecifiedchar/{char}")
    public List<Mobile> getModelBySpeicifiedCharSeq(@PathVariable(value = "char") String charSeq)
    {
        return service.getModelNameBySpecifiedCharSeq(charSeq);
    }

    @GetMapping("/getmodelbelowspecificprice/{modelname}/{pricemodel}")
    public List<Mobile> getMobileBelowSpecificPrice(@PathVariable(value = "modelname") String model,@PathVariable(value = "") double price)
    {
        return service.getMobileBelowSpecificPrice(model,price);
    }

    @DeleteMapping("/deletemobiles/{id}")
    public int deleteMobiles(@PathVariable(value = "id") int count)
    {
        return service.deleteMobiles(count);
    }

}

