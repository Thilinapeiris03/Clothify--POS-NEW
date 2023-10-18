package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Order {
    private String orderId;
    private String empId;
    private String custId;
    private String empName;
    private String date;
    private Double totalPrice;
    private Double paymentType;
    private Double arries;
    private Double discount;
}
