package org.jspiders.springrestdataapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "customer")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int customerId;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "customer_age")
    private int customerAge;


//    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH})
//    @JoinColumn(name = "customer_ref")
//    private int customerRef;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "customerRef") //,mappedBy = "customerRef"
    private List<Orders> ordersList;
}
