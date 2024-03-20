package org.jspiders.springrestdataapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private int personId;
    @Column(name = "person_name")
    private String personName;
    //@Column(name = "address_ref")
    //private int addressRef;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_ref")
    private Address address;

}
