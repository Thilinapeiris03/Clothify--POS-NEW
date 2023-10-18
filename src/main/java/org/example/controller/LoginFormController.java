/**
 * Sample Skeleton for 'loginForm.fxml' Controller Class
 */

package org.example.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class LoginFormController {

    @FXML // fx:id="btnSignIn"
    private JFXButton btnSignIn; // Value injected by FXMLLoader

    @FXML // fx:id="lblSignup"
    private Label lblSignup; // Value injected by FXMLLoader

    @FXML // fx:id="lblForgetPassword"
    private Label lblForgetPassword; // Value injected by FXMLLoader

    @FXML
    void btnSignInOnAction(ActionEvent event) {

    }

    @FXML
    void lblForgetPasswordOnAction(MouseEvent event) {

    }

    @FXML
    void lblSignupOnAction(MouseEvent event) {

    }

}
