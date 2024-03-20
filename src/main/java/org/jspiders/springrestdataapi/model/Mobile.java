package org.jspiders.springrestdataapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "mobile_info")
public class Mobile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mobile_id")
    private int mobileId;
    @Column(name = "model_name")
    private String modelName;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "mobile_price")
    private double modelPrice;
}
