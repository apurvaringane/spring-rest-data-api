package org.jspiders.springrestdataapi.repository;

import jakarta.transaction.Transactional;
import org.jspiders.springrestdataapi.model.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MobileRepository extends JpaRepository<Mobile,Integer> {


    //find all the mobile details based on specified model name
    Mobile findByModelName(String name);

    //find the mobile details based on specified company name
    Mobile findByCompanyName(String name);

    List<Mobile> readByCompanyName(String name);

    //find all the mobiles having price greater than specified value
    List<Mobile> findByModelPriceGreaterThan(double price);

    //find all the mobiles for specific company having price less than specific value
    List<Mobile> findByModelPriceLessThan(double price);

    //find all the mobiles based on model and company name
    List<Mobile> findByModelNameAndCompanyName(String model,String company);

    //find all the mobiles having price between given range
    List<Mobile> findByModelPriceBetween(double start,double end);

    //display only the first mobile details for specific company
    Mobile findFirstByCompanyName(String company);

    //find first 3 model by company name
    Mobile findFirst3ByCompanyName(String company);

    //display all mobile details either having specific company or having less than specific value
    List<Mobile> findByCompanyNameOrModelPriceLessThan(String name,double price);

    //display all models
    @Query("select m.modelName from Mobile m")
     List<String> getAllModel();

    //display all companies
    @Query("select distinct m.companyName from Mobile m")
    List<String> getAllCompany();

    //display all model of specific company
    @Query("select m.modelName from Mobile m where m.companyName=:company")
    List<String> getModelsByCompany(@Param("company") String com);

    //display all mobiles whose model name contains specified sequence of characters.
    @Query("select m from Mobile m where m.modelName LIKE %:charSeq%")
    List<Mobile> getModelNameBySpecifiedCharSeq(@Param("charSeq") String charSeq);

    //display all mobiles having specific model and price below specific value

    //@Query(name = "select * from mobile_info where model_name=:model and model_price<:price",nativeQuery = true)
    @Query("select m from Mobile m where m.modelName=:model AND m.modelPrice<:price")
    List<Mobile> getMobileBelowSpecificPrice(@Param("model") String model,@Param("price") double price);

    //delete first n number of mobiles
    @Transactional
    @Modifying
    @Query("delete from Mobile m where m.mobileId<=:count")
    int deleteMobiles(@Param("count") int count);
}
