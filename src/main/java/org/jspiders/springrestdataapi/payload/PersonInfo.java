package org.jspiders.springrestdataapi.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonInfo {
    private String personName;
    private String city;
    private int pinCode;
}
