/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem.View_Controller;

import inventorysystem.Model.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {
    
    private Inventory inventory;
    
    private ObservableList<Product> productList;
    
    private ObservableList<Part> partList;
    
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="partSearchButton"
    private Button partSearchButton; // Value injected by FXMLLoader

    @FXML // fx:id="partSearchTextBox"
    private TextField partSearchTextBox; // Value injected by FXMLLoader

    @FXML // fx:id="partsTable"
    private TableView<Part> partsTable; // Value injected by FXMLLoader

    @FXML // fx:id="partIdCol"
    private TableColumn<Part, Integer> partIdCol; // Value injected by FXMLLoader

    @FXML // fx:id="partNameCol"
    private TableColumn<Part, String> partNameCol; // Value injected by FXMLLoader

    @FXML // fx:id="partInventoryCol"
    private TableColumn<Part, Integer> partInventoryCol; // Value injected by FXMLLoader

    @FXML // fx:id="partCostCol"
    private TableColumn<Part, Double> partCostCol; // Value injected by FXMLLoader

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
    private TableView<Product> productsTable; // Value injected by FXMLLoader

    @FXML // fx:id="productIdCol"
    private TableColumn<Product, Integer> productIdCol; // Value injected by FXMLLoader

    @FXML // fx:id="productNameCol"
    private TableColumn<Product, String> productNameCol; // Value injected by FXMLLoader

    @FXML // fx:id="productInventoryCol"
    private TableColumn<Product, Integer> productInventoryCol; // Value injected by FXMLLoader

    @FXML // fx:id="productPriceCol"
    private TableColumn<Product, Double> productPriceCol; // Value injected by FXMLLoader

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
        
        inventory = new Inventory();
        productList = inventory.products;
        partList = inventory.allParts;
        
        productIdCol.setCellValueFactory(c -> c.getValue().productIdProperty().asObject());
        productNameCol.setCellValueFactory(c -> c.getValue().productNameProperty());
        productInventoryCol.setCellValueFactory(c -> c.getValue().inStockProperty().asObject());
        productPriceCol.setCellValueFactory(c -> c.getValue().priceProperty().asObject());
        productsTable.setItems(productList);
        
        partIdCol.setCellValueFactory(c -> c.getValue().partIdProperty().asObject());
        partNameCol.setCellValueFactory(c -> c.getValue().nameProperty());
        partInventoryCol.setCellValueFactory(c -> c.getValue().inStockProperty().asObject());
        partCostCol.setCellValueFactory(c -> c.getValue().priceProperty().asObject());
        partsTable.setItems(partList);
        
        //productsTable = new TableView<>(inventory.products);
        
        
        Product product1 = new Product(0, "product test", 1.99, 0, 0, 10, new ArrayList<>());
        inventory.addProduct(product1);
        InhousePart part1 = new InhousePart();
        part1.setName("part name");
        part1.setPartID(0);
        part1.setPrice(3.99);
        product1.addAssociatedPart(part1);
        inventory.addPart(part1);
        
    }
    
    @FXML
    private void ExitApplication(ActionEvent event){
        Platform.exit();
    }
    
    @FXML
    private void SearchProducts(ActionEvent event){
        String searchString = productSearchBox.getText();
        if (!searchString.isEmpty()) {
            ObservableList<Product> prodSearch = FXCollections.observableArrayList();
            
            boolean found = false;
            try {
                int productId = Integer.parseInt(searchString);
                prodSearch.addAll(productList.filtered(p -> p.getProductID() == productId));
                if(prodSearch.size()> 0) found=true;
            } 
            catch (NumberFormatException e) {
                prodSearch.addAll(productList.filtered(p -> p.getName().contains(searchString)));
                if(prodSearch.size()> 0) found=true;
            }
            if (found) {
                productsTable.setItems(prodSearch);
            } else {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Not Found");
                alert.setContentText("No matching product found by that ID or name.");
                alert.showAndWait();
            }
        } else {
            productsTable.setItems(productList);
        }        
    }
    
    @FXML
    private void SearchParts(ActionEvent event){
        String searchString = partSearchTextBox.getText();
        if (!searchString.isEmpty()) {
            ObservableList<Part> partSearch = FXCollections.observableArrayList();
            
            boolean found = false;
            try {
                int partId = Integer.parseInt(searchString);
                partSearch.addAll(partList.filtered(p -> p.getPartID() == partId));
                if(partSearch.size() > 0) found = true;
            } 
            catch (Exception e) {
                partSearch.addAll(partList.filtered(p -> p.getName().contains(searchString)));
                if(partSearch.size() > 0) found = true;
            }
            if (found) {
                partsTable.setItems((partSearch));
            } else {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Not Found");
                alert.setContentText("No matching part found by that ID or name.");
                alert.showAndWait();
            }
        } else {
            partsTable.setItems(partList);
        }
    }
    
    private void OpenInhousePartWindow(InhousePart partToLoad) throws IOException {
        Parent root;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddModifyInhousePart.fxml"));
        root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        AddModifyInhousePartController controller = loader.getController();
        controller.SetPartList(partList);
        controller.SetPart(partToLoad);
        controller.setMachineId(Integer.toString(partToLoad.getMachineID()));
        controller.setInventory(inventory);
    }
    
    private void OpenOutsourcedPartWindow(OutsourcedPart partToLoad) throws IOException {
        Parent root;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddModifyOutsourcedPart.fxml"));
        root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        AddModifyOutsourcedPartController controller = loader.getController();
        controller.SetPartList(partList);
        controller.SetPart(partToLoad);
        controller.setCompName(partToLoad.getCompanyName());
        controller.setInventory(inventory);
    }
    
    @FXML
    private void AddPart(ActionEvent event) throws IOException{
        int nextPartId = (partList.size() > 0 ? partList.stream().mapToInt(Part::getPartID).max().orElse(0) : 0) + 1;
        InhousePart part = new InhousePart();
        part.setPartID(nextPartId);
        OpenInhousePartWindow(part);
    }
    
    @FXML
    private void ModifyPart(ActionEvent event) throws IOException{
        Part partToLoad = partsTable.getSelectionModel().getSelectedItem();
        if (partToLoad == null) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("No part selected");
            alert.setContentText("Please select a part from the table.");
            alert.showAndWait();
            return;
        }
        if (partToLoad instanceof InhousePart) {
            OpenInhousePartWindow((InhousePart)partToLoad);
        } else {
            OpenOutsourcedPartWindow((OutsourcedPart)partToLoad);
        }
    }
    
    private void OpenProductWindow(Product productToOpen) throws IOException {
        Parent root;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddModifyProduct.fxml"));
        root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        AddModifyProductController controller = loader.getController();
        controller.setProduct(productToOpen);
        controller.setInventory(inventory);
    }
    
    @FXML
    private void AddProduct(ActionEvent event) throws IOException{
        Product product = new Product();
        int maxId = (productList.size() > 0 ? productList.stream().mapToInt(Product::getProductID).max().orElse(0) : 0) + 1;
        product.setProductID(maxId);
        OpenProductWindow(product);
    }
    
    @FXML
    private void ModifyProduct(ActionEvent event) throws IOException{
        Product productToLoad = productsTable.getSelectionModel().getSelectedItem();
        if (productToLoad != null) {
            OpenProductWindow(productToLoad);
        } else {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("No product selected");
            alert.setContentText("Please select a product from the table.");
            alert.showAndWait();
            return;
        }        
    }
    
    @FXML
    private void DeletePart(ActionEvent event) {
        Part part = partsTable.getSelectionModel().getSelectedItem();
        if (part == null) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("No part selected");
            alert.setContentText("Please select a part from the table.");
            alert.showAndWait();
            return;
        }
        
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Are you sure?");
        alert.setContentText("Are you sure you wish to delete this part?");
        Optional<ButtonType> buttonResult = alert.showAndWait();
        if (buttonResult.get() == ButtonType.OK) {
            
            inventory.deletePart(part);
            partsTable.setItems(partList);
        }
    }
    
    @FXML
    private void DeleteProduct(ActionEvent event){
        Product product = productsTable.getSelectionModel().getSelectedItem();
        if (product == null) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("No product selected");
            alert.setContentText("Please select a product from the table.");
            alert.showAndWait();
            return;
        }
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Are you sure?");
        alert.setContentText("Are you sure you wish to delete this part from the product?");
        Optional<ButtonType> buttonResult = alert.showAndWait();
        if (buttonResult.get() == ButtonType.OK) {            
            if (product.getAssociatedParts().size() > 0) {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Parts associated with product");
                alert.setContentText("This product has parts associated with it. Are you sure you wish to delete it?");
                buttonResult = alert.showAndWait();
                if (buttonResult.get() != ButtonType.OK) {
                    return;
                }
            }
            inventory.removeProduct(product.getProductID());
            productsTable.setItems(productList);
            
        }
    }
}