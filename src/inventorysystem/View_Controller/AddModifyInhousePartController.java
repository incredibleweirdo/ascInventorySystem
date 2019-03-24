/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem.View_Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AddModifyInhousePartController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="addModifyPartLabel"
    private Label addModifyPartLabel; // Value injected by FXMLLoader

    @FXML // fx:id="partMachOrCompLabel"
    private Label partMachOrCompLabel; // Value injected by FXMLLoader

    @FXML // fx:id="partIdbox"
    private TextField partIdbox; // Value injected by FXMLLoader

    @FXML // fx:id="partNameBox"
    private TextField partNameBox; // Value injected by FXMLLoader

    @FXML // fx:id="partInventoryBox"
    private TextField partInventoryBox; // Value injected by FXMLLoader

    @FXML // fx:id="partCostBox"
    private TextField partCostBox; // Value injected by FXMLLoader

    @FXML // fx:id="partMachineOrCompBox"
    private TextField partMachineOrCompBox; // Value injected by FXMLLoader

    @FXML // fx:id="partMaxBox"
    private TextField partMaxBox; // Value injected by FXMLLoader

    @FXML // fx:id="partMinBox"
    private TextField partMinBox; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert addModifyPartLabel != null : "fx:id=\"addModifyPartLabel\" was not injected: check your FXML file 'AddModifyInhousePart.fxml'.";
        assert partMachOrCompLabel != null : "fx:id=\"partMachOrCompLabel\" was not injected: check your FXML file 'AddModifyInhousePart.fxml'.";
        assert partIdbox != null : "fx:id=\"partIdbox\" was not injected: check your FXML file 'AddModifyInhousePart.fxml'.";
        assert partNameBox != null : "fx:id=\"partNameBox\" was not injected: check your FXML file 'AddModifyInhousePart.fxml'.";
        assert partInventoryBox != null : "fx:id=\"partInventoryBox\" was not injected: check your FXML file 'AddModifyInhousePart.fxml'.";
        assert partCostBox != null : "fx:id=\"partCostBox\" was not injected: check your FXML file 'AddModifyInhousePart.fxml'.";
        assert partMachineOrCompBox != null : "fx:id=\"partMachineOrCompBox\" was not injected: check your FXML file 'AddModifyInhousePart.fxml'.";
        assert partMaxBox != null : "fx:id=\"partMaxBox\" was not injected: check your FXML file 'AddModifyInhousePart.fxml'.";
        assert partMinBox != null : "fx:id=\"partMinBox\" was not injected: check your FXML file 'AddModifyInhousePart.fxml'.";

    }
}
