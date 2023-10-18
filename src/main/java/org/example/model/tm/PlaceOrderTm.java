package org.example.model.tm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PlaceOrderTm {
    private String itemCode;
    private String description;
    private String type;
    private String size;
    private Double qty;
    private Double unitPrice;
    private Double qtyPrice;
    private Double discount;
    private Double price;


}
