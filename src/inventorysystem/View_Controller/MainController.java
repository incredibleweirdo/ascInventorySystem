/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem.View_Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MainController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="partSearchButton"
    private Button partSearchButton; // Value injected by FXMLLoader

    @FXML // fx:id="partSearchTextBox"
    private TextField partSearchTextBox; // Value injected by FXMLLoader

    @FXML // fx:id="partsTable"
    private TableView<?> partsTable; // Value injected by FXMLLoader

    @FXML // fx:id="partIdCol"
    private TableColumn<?, ?> partIdCol; // Value injected by FXMLLoader

    @FXML // fx:id="partNameCol"
    private TableColumn<?, ?> partNameCol; // Value injected by FXMLLoader

    @FXML // fx:id="partInventoryCol"
    private TableColumn<?, ?> partInventoryCol; // Value injected by FXMLLoader

    @FXML // fx:id="partCostCol"
    private TableColumn<?, ?> partCostCol; // Value injected by FXMLLoader

    @FXML // fx:id="partAddButton"
    private Button partAddButton; // Value injected by FXMLLoader

    @FXML // fx:id="partModifyButton"
    private Button partModifyButton; // Value injected by FXMLLoader

    @FXML // fx:id="partRemoveButton"
    private Button partRemoveButton; // Value injected by FXMLLoader

    @FXML // fx:id="productSearchButton"
    private Button productSearchButton; // Value injected by FXMLLoader

    @FXML // fx:id="productSearchBox"
    private TextField productSearchBox; // Value injected by FXMLLoader

    @FXML // fx:id="productsTable"
    private TableView<?> productsTable; // Value injected by FXMLLoader

    @FXML // fx:id="productIdCol"
    private TableColumn<?, ?> productIdCol; // Value injected by FXMLLoader

    @FXML // fx:id="productNameCol"
    private TableColumn<?, ?> productNameCol; // Value injected by FXMLLoader

    @FXML // fx:id="productInventoryCol"
    private TableColumn<?, ?> productInventoryCol; // Value injected by FXMLLoader

    @FXML // fx:id="productPriceCol"
    private TableColumn<?, ?> productPriceCol; // Value injected by FXMLLoader

    @FXML // fx:id="productAddButton"
    private Button productAddButton; // Value injected by FXMLLoader

    @FXML // fx:id="productModifyButton"
    private Button productModifyButton; // Value injected by FXMLLoader

    @FXML // fx:id="productRemoveButton"
    private Button productRemoveButton; // Value injected by FXMLLoader

    @FXML // fx:id="exitButton"
    private Button exitButton; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert partSearchButton != null : "fx:id=\"partSearchButton\" was not injected: check your FXML file 'main.fxml'.";
        assert partSearchTextBox != null : "fx:id=\"partSearchTextBox\" was not injected: check your FXML file 'main.fxml'.";
        assert partsTable != null : "fx:id=\"partsTable\" was not injected: check your FXML file 'main.fxml'.";
        assert partIdCol != null : "fx:id=\"partIdCol\" was not injected: check your FXML file 'main.fxml'.";
        assert partNameCol != null : "fx:id=\"partNameCol\" was not injected: check your FXML file 'main.fxml'.";
        assert partInventoryCol != null : "fx:id=\"partInventoryCol\" was not injected: check your FXML file 'main.fxml'.";
        assert partCostCol != null : "fx:id=\"partCostCol\" was not injected: check your FXML file 'main.fxml'.";
        assert partAddButton != null : "fx:id=\"partAddButton\" was not injected: check your FXML file 'main.fxml'.";
        assert partModifyButton != null : "fx:id=\"partModifyButton\" was not injected: check your FXML file 'main.fxml'.";
        assert partRemoveButton != null : "fx:id=\"partRemoveButton\" was not injected: check your FXML file 'main.fxml'.";
        assert productSearchButton != null : "fx:id=\"productSearchButton\" was not injected: check your FXML file 'main.fxml'.";
        assert productSearchBox != null : "fx:id=\"productSearchBox\" was not injected: check your FXML file 'main.fxml'.";
        assert productsTable != null : "fx:id=\"productsTable\" was not injected: check your FXML file 'main.fxml'.";
        assert productIdCol != null : "fx:id=\"productIdCol\" was not injected: check your FXML file 'main.fxml'.";
        assert productNameCol != null : "fx:id=\"productNameCol\" was not injected: check your FXML file 'main.fxml'.";
        assert productInventoryCol != null : "fx:id=\"productInventoryCol\" was not injected: check your FXML file 'main.fxml'.";
        assert productPriceCol != null : "fx:id=\"productPriceCol\" was not injected: check your FXML file 'main.fxml'.";
        assert productAddButton != null : "fx:id=\"productAddButton\" was not injected: check your FXML file 'main.fxml'.";
        assert productModifyButton != null : "fx:id=\"productModifyButton\" was not injected: check your FXML file 'main.fxml'.";
        assert productRemoveButton != null : "fx:id=\"productRemoveButton\" was not injected: check your FXML file 'main.fxml'.";
        assert exitButton != null : "fx:id=\"exitButton\" was not injected: check your FXML file 'main.fxml'.";

    }
}