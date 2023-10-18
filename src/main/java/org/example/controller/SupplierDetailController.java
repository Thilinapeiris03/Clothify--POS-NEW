/**
 * Sample Skeleton for 'SupplierDetail.fxml' Controller Class
 */

package org.example.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
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

public class SupplierDetailController implements Initializable {
    @FXML
    public JFXTextField txtSupplierId;
    @FXML
    public AnchorPane paneSupplierDetail;
    @FXML
    public JFXButton btnNew;
    @FXML
    private JFXTextField txtSupplierName;

    @FXML
    private JFXTextField txtSupplierCompany;

    @FXML
    private JFXTextField txtSupplierAddress;

    @FXML
    private JFXTextField txtSupplierContact;

    @FXML
    private JFXTextField txtSupplierEmail;

    @FXML // fx:id="btnAddSupplier"
    private JFXButton btnAddSupplier; // Value injected by FXMLLoader

    @FXML // fx:id="btnBack"
    private JFXButton btnBack; // Value injected by FXMLLoader

    @FXML // fx:id="btnUpdate"
    private JFXButton btnUpdate; // Value injected by FXMLLoader

    @FXML // fx:id="btnDeleteSupplier"
    private JFXButton btnDeleteSupplier; // Value injected by FXMLLoader

    @FXML // fx:id="btnPrintSupplier"
    private JFXButton btnPrintSupplier; // Value injected by FXMLLoader

    @FXML
    void btnAddSupplierOnAction(ActionEvent event) {
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            String sql = "INSERT INTO Supplier VALUES(?,?,?,?,?,?)";
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setString(1,txtSupplierId.getText());
            pstm.setString(2,txtSupplierName.getText());
            pstm.setString(3,txtSupplierCompany.getText());
            pstm.setString(4,txtSupplierAddress.getText());
            pstm.setString(5,txtSupplierContact.getText());
            pstm.setString(6,txtSupplierEmail.getText());

            if(pstm.executeUpdate()>0){
                new Alert(Alert.AlertType.INFORMATION,"Supplier Added..!").show();
                clearFeilds();
            }else{
                new Alert(Alert.AlertType.ERROR,"Added Failed..!").show();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

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
    void btnDeleteSupplierOnAction(ActionEvent event) {

    }

    @FXML
    void btnPrintSupplierOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            String sql = "Update Supplier set sup_Name=?, company=?, address=?, contact=?, email=? where supplier_Id=?";
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setString(1,txtSupplierName.getText());
            pstm.setString(2,txtSupplierCompany.getText());
            pstm.setString(3,txtSupplierAddress.getText());
            pstm.setString(4,txtSupplierContact.getText());
            pstm.setString(5,txtSupplierEmail.getText());
            pstm.setString(6,txtSupplierId.getText());

            if(pstm.executeUpdate()>0){
                new Alert(Alert.AlertType.INFORMATION,"Update Success..!").show();
                clearFeilds();
            }else{
                new Alert(Alert.AlertType.ERROR,"Update Failed..!").show();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        generateId();
    }

    private void generateId() {
        Connection connection = null;
        try {
            connection = DBConnection.getInstance().getConnection();
            PreparedStatement ptsm = connection.prepareStatement("SELECT supplier_Id FROM Supplier order by supplier_Id DESC LIMIT 1");
            ResultSet resultSet = ptsm.executeQuery();
            if(resultSet.next()){
                int num = Integer.parseInt(resultSet.getString(1).split("[P]")[1]);
                num++;
                txtSupplierId.setText(String.format("SP%04d",num));
            }else{
                txtSupplierId.setText("SP0001");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void clearFeilds(){
        txtSupplierId.setText(null);
        txtSupplierName.setText(null);
        txtSupplierCompany.setText(null);
        txtSupplierEmail.setText(null);
        txtSupplierContact.setText(null);
        txtSupplierAddress.setText(null);
    }

    @FXML
    public void btnNewOnAction(ActionEvent actionEvent) {
        generateId();
    }


    public static ArrayList<String> getAllSupplierIds() throws ClassNotFoundException, SQLException{

        ResultSet rst  = DBConnection.getInstance().getConnection()
                .prepareStatement("SELECT supplier_Id FROM Supplier")
                .executeQuery();
        ArrayList<String> idSet= new ArrayList<>();
        while (rst.next()) {
            idSet.add(rst.getString(1));
        }
        return idSet;
    }
}
