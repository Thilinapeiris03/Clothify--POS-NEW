/**
 * Sample Skeleton for 'SignupForm.fxml' Controller Class
 */

package org.example.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class SignupFormController {

    @FXML // fx:id="btnSignup"
    private JFXButton btnSignup; // Value injected by FXMLLoader

    @FXML // fx:id="txtRetypePassword"
    private JFXPasswordField txtRetypePassword; // Value injected by FXMLLoader

    @FXML // fx:id="txtUserEmail"
    private JFXTextField txtUserEmail; // Value injected by FXMLLoader

    @FXML // fx:id="chkShowPassword"
    private JFXCheckBox chkShowPassword; // Value injected by FXMLLoader

    @FXML // fx:id="lblSignin"
    private Label lblSignin; // Value injected by FXMLLoader

    @FXML // fx:id="txtEmpId"
    private JFXTextField txtEmpId; // Value injected by FXMLLoader

    @FXML // fx:id="txtUserPassword"
    private JFXPasswordField txtUserPassword; // Value injected by FXMLLoader

    @FXML
    void btnSignupOnAction(ActionEvent event) {

    }

    @FXML
    void chkShowPasswordOnAction(ActionEvent event) {

    }

    @FXML
    void lblSigninOnAction(MouseEvent event) {

    }

}
