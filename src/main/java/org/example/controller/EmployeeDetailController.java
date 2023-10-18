/**
 * Sample Skeleton for 'EmployeeDetail.fxml' Controller Class
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

public class EmployeeDetailController {

    @FXML // fx:id="btnBack"
    private JFXButton btnBack; // Value injected by FXMLLoader

    @FXML // fx:id="btnPrintEmployee"
    private JFXButton btnPrintEmployee; // Value injected by FXMLLoader

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
    void btnPrintEmployeeOnAction(ActionEvent event) {

    }

}
