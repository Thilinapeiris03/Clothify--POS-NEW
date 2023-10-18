/**
 * Sample Skeleton for 'ItemDetails.fxml' Controller Class
 */

package org.example.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import org.example.db.DBConnection;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ItemDetailController implements Initializable {

    @FXML
    private JFXTextField txtSupplierName;

    @FXML
    private JFXButton btnAddStock;

    @FXML
    private JFXTextField txtItemCode;

    @FXML
    private JFXButton btnBack;

    @FXML
    private JFXComboBox<?> txtSupplierId;

    @FXML
    private JFXTextField txtDescription;

    @FXML
    private JFXTextField txtQtyAvail;

    @FXML
    private JFXTextField txtItemPrice;

    @FXML
    private JFXComboBox<?> txtType;

    @FXML
    private JFXTextField txtQtyAdd;

    @FXML
    private JFXTextField txtSellingPrice;

    @FXML
    private JFXTextField txtProfit;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private JFXButton btnClear;

    @FXML
    private JFXButton btnDeleteSelected;

    @FXML
    private JFXButton btnPrintItem;

    @FXML
    private JFXTextField txtDate;

    @FXML
    void btnAddStockOnAction(ActionEvent event) {
//        try {
//            Connection connection = DBConnection.getInstance().getConnection();
//            String sql = "INSERT INTO Item VALUES(?,?,?,?,?,?)";
//            PreparedStatement pstm = connection.prepareStatement(sql);
//            pstm.setString(1,txtSupplierId.getText());
//            pstm.setString(2,txtSupplierName.getText());
//            pstm.setString(3,txtSupplierCompany.getText());
//            pstm.setString(4,txtSupplierAddress.getText());
//            pstm.setString(5,txtSupplierContact.getText());
//            pstm.setString(6,txtSupplierEmail.getText());
//
//            if(pstm.executeUpdate()>0){
//                new Alert(Alert.AlertType.INFORMATION,"Supplier Added..!").show();
//            }else{
//                new Alert(Alert.AlertType.ERROR,"Added Failed..!").show();
//            }
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

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
    void btnDeleteSelectedOnAction(ActionEvent event) {

    }

    @FXML
    void btnPrintItemOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        generateId();
        loadTable();
    }

    private void loadTable(){

    }
    private void generateId() {
        Connection connection = null;
        try {
            connection = DBConnection.getInstance().getConnection();
            PreparedStatement ptsm = connection.prepareStatement("SELECT item_Id FROM Item order by item_Id DESC LIMIT 1");
            ResultSet resultSet = ptsm.executeQuery();
            if(resultSet.next()){
                int num = Integer.parseInt(resultSet.getString(1).split("[I]")[1]);
                num++;
                txtItemCode.setText(String.format("I%04d",num));
            }else{
                txtItemCode.setText("I0001");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
