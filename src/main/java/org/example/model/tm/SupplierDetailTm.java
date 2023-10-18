package org.example.model.tm;

import com.jfoenix.controls.JFXButton;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SupplierDetailTm {
    private String supplierID;
    private String supName;
    private String company;
    private String address;
    private String contact;
    private String email;
    private JFXButton btnDelete;
}
