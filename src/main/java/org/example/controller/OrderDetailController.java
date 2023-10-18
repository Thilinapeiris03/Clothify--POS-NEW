/**
 * Sample Skeleton for 'OrderDetails.fxml' Controller Class
 */

package org.example.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class OrderDetailController {

    @FXML // fx:id="btnBack"
    private JFXButton btnBack; // Value injected by FXMLLoader

    @FXML // fx:id="btnArriesUpdate"
    private JFXButton btnArriesUpdate; // Value injected by FXMLLoader

    @FXML
    void btnArriesUpdateOnAction(ActionEvent event) {

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

}
