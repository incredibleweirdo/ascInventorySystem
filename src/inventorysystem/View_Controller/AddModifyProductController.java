/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem.View_Controller;

import inventorysystem.Model.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddModifyProductController {

    private Product product;
    private ObservableList<Part> parts;
    private ObservableList<Part> searchParts;
    private Inventory inventory;
    
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="searchButton"
    private Button searchButton; // Value injected by FXMLLoader

    @FXML // fx:id="searchTextBox"
    private TextField searchTextBox; // Value injected by FXMLLoader

    @FXML // fx:id="partsSearchTable"
    private TableView<Part> partsSearchTable; // Value injected by FXMLLoader

    @FXML // fx:id="partIdSearchCol"
    private TableColumn<Part, Integer> partIdSearchCol; // Value injected by FXMLLoader

    @FXML // fx:id="partNameSearchCol"
    private TableColumn<Part, String> partNameSearchCol; // Value injected by FXMLLoader

    @FXML // fx:id="partInvSearchCol"
    private TableColumn<Part, Integer> partInvSearchCol; // Value injected by FXMLLoader

    @FXML // fx:id="partPriceSearchCol"
    private TableColumn<Part, Double> partPriceSearchCol; // Value injected by FXMLLoader

    @FXML // fx:id="partsInPrdTable"
    private TableView<Part> partsInPrdTable; // Value injected by FXMLLoader
    
    @FXML // fx:id="partIdInProdCol"
    private TableColumn<Part, Integer> partIdInProdCol; // Value injected by FXMLLoader

    @FXML // fx:id="partNameInPrdCol"
    private TableColumn<Part, String> partNameInPrdCol; // Value injected by FXMLLoader

    @FXML // fx:id="partInvInPrdCol"
    private TableColumn<Part, Integer> partInvInPrdCol; // Value injected by FXMLLoader

    @FXML // fx:id="partPriceInPrdCol"
    private TableColumn<Part, Double> partPriceInPrdCol; // Value injected by FXMLLoader

    @FXML // fx:id="addPartButton"
    private Button addPartButton; // Value injected by FXMLLoader

    @FXML // fx:id="removePartButton"
    private Button removePartButton; // Value injected by FXMLLoader

    @FXML // fx:id="saveProductButton"
    private Button saveProductButton; // Value injected by FXMLLoader

    @FXML // fx:id="cancelButton"
    private Button cancelButton; // Value injected by FXMLLoader

    @FXML // fx:id="productIdBox"
    private TextField productIdBox; // Value injected by FXMLLoader

    @FXML // fx:id="prodNameTextBox"
    private TextField prodNameTextBox; // Value injected by FXMLLoader

    @FXML // fx:id="invAmntTextBox"
    private TextField invAmntTextBox; // Value injected by FXMLLoader

    @FXML // fx:id="productPriceTextBox"
    private TextField productPriceTextBox; // Value injected by FXMLLoader

    @FXML // fx:id="minTextBox"
    private TextField minTextBox; // Value injected by FXMLLoader

    @FXML // fx:id="maxTextBox"
    private TextField maxTextBox; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert searchButton != null : "fx:id=\"searchButton\" was not injected: check your FXML file 'AddModifyProduct.fxml'.";
        assert searchTextBox != null : "fx:id=\"searchTextBox\" was not injected: check your FXML file 'AddModifyProduct.fxml'.";
        assert partsSearchTable != null : "fx:id=\"partsSearchTable\" was not injected: check your FXML file 'AddModifyProduct.fxml'.";assert partIdSearchCol != null : "fx:id=\"partIdSearchCol\" was not injected: check your FXML file 'AddModifyProduct.fxml'.";
        assert partNameSearchCol != null : "fx:id=\"partNameSearchCol\" was not injected: check your FXML file 'AddModifyProduct.fxml'.";
        assert partInvSearchCol != null : "fx:id=\"partInvSearchCol\" was not injected: check your FXML file 'AddModifyProduct.fxml'.";
        assert partPriceSearchCol != null : "fx:id=\"partPriceSearchCol\" was not injected: check your FXML file 'AddModifyProduct.fxml'.";
        assert partsInPrdTable != null : "fx:id=\"partsInPrdTable\" was not injected: check your FXML file 'AddModifyProduct.fxml'.";
        assert partIdInProdCol != null : "fx:id=\"partIdInProdCol\" was not injected: check your FXML file 'AddModifyProduct.fxml'.";
        assert partNameInPrdCol != null : "fx:id=\"partNameInPrdCol\" was not injected: check your FXML file 'AddModifyProduct.fxml'.";
        assert partInvInPrdCol != null : "fx:id=\"partInvInPrdCol\" was not injected: check your FXML file 'AddModifyProduct.fxml'.";
        assert partPriceInPrdCol != null : "fx:id=\"partPriceInPrdCol\" was not injected: check your FXML file 'AddModifyProduct.fxml'.";
        assert addPartButton != null : "fx:id=\"addPartButton\" was not injected: check your FXML file 'AddModifyProduct.fxml'.";
        assert removePartButton != null : "fx:id=\"removePartButton\" was not injected: check your FXML file 'AddModifyProduct.fxml'.";
        assert saveProductButton != null : "fx:id=\"saveProductButton\" was not injected: check your FXML file 'AddModifyProduct.fxml'.";
        assert cancelButton != null : "fx:id=\"cancelButton\" was not injected: check your FXML file 'AddModifyProduct.fxml'.";
        assert productIdBox != null : "fx:id=\"productIdBox\" was not injected: check your FXML file 'AddModifyProduct.fxml'.";
        assert prodNameTextBox != null : "fx:id=\"prodNameTextBox\" was not injected: check your FXML file 'AddModifyProduct.fxml'.";
        assert invAmntTextBox != null : "fx:id=\"invAmntTextBox\" was not injected: check your FXML file 'AddModifyProduct.fxml'.";
        assert productPriceTextBox != null : "fx:id=\"productPriceTextBox\" was not injected: check your FXML file 'AddModifyProduct.fxml'.";
        assert minTextBox != null : "fx:id=\"minTextBox\" was not injected: check your FXML file 'AddModifyProduct.fxml'.";
        assert maxTextBox != null : "fx:id=\"maxTextBox\" was not injected: check your FXML file 'AddModifyProduct.fxml'.";
        
        parts = FXCollections.observableArrayList();
        searchParts = FXCollections.observableArrayList();
        
        partNameSearchCol.setCellValueFactory(c -> c.getValue().nameProperty());
        partIdSearchCol.setCellValueFactory(c -> c.getValue().partIdProperty().asObject());
        partInvSearchCol.setCellValueFactory(c -> c.getValue().inStockProperty().asObject());
        partPriceSearchCol.setCellValueFactory(c -> c.getValue().priceProperty().asObject());
        partsSearchTable.setItems(searchParts);
        
        partNameInPrdCol.setCellValueFactory(c -> c.getValue().nameProperty());
        partIdInProdCol.setCellValueFactory(c -> c.getValue().partIdProperty().asObject());
        partInvInPrdCol.setCellValueFactory(c -> c.getValue().inStockProperty().asObject());
        partPriceInPrdCol.setCellValueFactory(c -> c.getValue().priceProperty().asObject());
        partsInPrdTable.setItems(parts);
        
    }
    
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
        partsSearchTable.setItems(inventory.allParts);
    }
    
    public void setProduct(Product product){
        this.product = product;
        if (product.getAssociatedParts() != null & product.getAssociatedParts().size() > 0) {
            partsInPrdTable.setItems(FXCollections.observableArrayList(product.getAssociatedParts()));
        }
        prodNameTextBox.setText(product.getName());
        productIdBox.setText(Integer.toString(product.getProductID()));
        productPriceTextBox.setText(Double.toString(product.getPrice()));
        maxTextBox.setText(Integer.toString(product.getMax()));
        minTextBox.setText(Integer.toString(product.getMin()));
        invAmntTextBox.setText(Integer.toString(product.getInStock()));
    }
    
    @FXML
    private Boolean removePart(ActionEvent evnt){
        int partId = partsInPrdTable.getSelectionModel().getSelectedItem().getPartID();
        boolean result = false;
        result = this.parts.removeIf(p -> p.getPartID() == partId);
        if (result) {
            partsInPrdTable.setItems(parts);
        }
        return result;
    }
    
    @FXML
    private void addPart(ActionEvent event){
        Part partToAdd = partsSearchTable.getSelectionModel().getSelectedItem();
        if (!product.getAssociatedParts().contains(partToAdd)) {
            product.addAssociatedPart(partToAdd);
            partsInPrdTable.setItems(FXCollections.observableArrayList(product.getAssociatedParts()));
        }
    }
    
    private Boolean validateProduct(){
        Boolean result = false;
        
        result = product.getAssociatedParts().stream().mapToDouble(a -> a.getPrice()).sum() <= product.getPrice();
        result = product.getMin() < product.getMax();
        result = product.getAssociatedParts().size() > 0;
        
        
        return result;
    }
    
    @FXML
    private void Cancel(ActionEvent event){
        this.product = null;
        Stage stage = (Stage)cancelButton.getScene().getWindow();
        stage.close();
    }
    
    @FXML
    private void Save(ActionEvent event){
        product.setName(prodNameTextBox.getText());
        product.setInStock(Integer.parseInt(invAmntTextBox.getText()));
        product.setPrice(Double.parseDouble(productPriceTextBox.getText()));
        product.setMax(Integer.parseInt(maxTextBox.getText()));
        product.setMin(Integer.parseInt(minTextBox.getText()));
        if (!inventory.products.contains(product)) {
            inventory.addProduct(product);
        }        
        Stage stage = (Stage)saveProductButton.getScene().getWindow();
        stage.close();
    }
}

