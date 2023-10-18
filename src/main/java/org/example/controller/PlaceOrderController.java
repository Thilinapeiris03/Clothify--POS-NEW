/**
 * Sample Skeleton for 'PlaceOrder.fxml' Controller Class
 */

package org.example.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class PlaceOrderController {

    @FXML
    private JFXTextField lblEmpName;

    @FXML
    private JFXButton btnAddToCart;

    @FXML
    private JFXComboBox<?> lblOrderId;

    @FXML
    private JFXButton btnBack;

    @FXML
    private JFXComboBox<?> lblEmpId;

    @FXML
    private JFXTextField txtCustName;

    @FXML
    private JFXTextField txtCustContact;

    @FXML
    private JFXTextField txtCustEmail;

    @FXML
    private JFXTextField txtDescription;

    @FXML
    private JFXComboBox<?> lblItemCode;

    @FXML
    private JFXTextField txtQty;

    @FXML
    private JFXTextField txtDiscount;

    @FXML
    private JFXComboBox<?> lblType;

    @FXML
    private JFXComboBox<?> lblSize;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private JFXButton btnClear;

    @FXML
    private JFXButton btnRemoveOrder;

    @FXML
    private JFXButton btnPlaceOrder;

    @FXML
    private Label lblTotalQtyPrice;

    @FXML
    private Label lblTotalDiscount;

    @FXML
    private Label lblTotalPrice;

    @FXML
    private Label lblBalance;

    @FXML
    private JFXTextField txtCash;

    @FXML
    private JFXTextField lblDate;

    @FXML
    private Label lblQtyOnHand;

    @FXML
    private Label lblSellingPrice;

    @FXML
    void btnAddToCartOnAction(ActionEvent event) {

    }

    @FXML
    void btnBackOnAction(ActionEvent event) {
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        try {
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/UserDashboard.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        window.show();

    }

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

    @FXML
    void btnPlaceOrderOnAction(ActionEvent event) {

    }

    @FXML
    void btnRemoveOrderOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

}
