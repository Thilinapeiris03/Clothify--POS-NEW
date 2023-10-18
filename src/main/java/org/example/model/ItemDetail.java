package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ItemDetail {
    String itemId;
    String supplierId;
    String description;
    Double qty;
    Double price;
    Double sellingPrice;
    String type;
    String size;
}
