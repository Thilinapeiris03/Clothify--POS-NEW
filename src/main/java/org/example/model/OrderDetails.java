package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDetails {
    String orderDetailId;
    String orderId;
    String itemCode;
    String description;
    String type;
    String size;
    Double qty;
    Double unitPrice;
    Double qtyPrice;
    Double discount;
    Double price;

}
