package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmpDetail {
    String empId;
    String name;
    String email;
    String address;
    String accNumber;
    String nic;
    String phNumber;
}
