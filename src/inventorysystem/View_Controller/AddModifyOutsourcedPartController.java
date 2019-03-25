/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem.View_Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddModifyOutsourcedPartController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="addModifyPartLabel"
    private Label addModifyPartLabel; // Value injected by FXMLLoader

    @FXML // fx:id="inHouseButton"
    private RadioButton inHouseButton; // Value injected by FXMLLoader

    @FXML // fx:id="outsourcedButton"
    private RadioButton outsourcedButton; // Value injected by FXMLLoader

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
        assert addModifyPartLabel != null : "fx:id=\"addModifyPartLabel\" was not injected: check your FXML file 'AddModifyOutsourcedPart.fxml'.";
        assert inHouseButton != null : "fx:id=\"inHouseButton\" was not injected: check your FXML file 'AddModifyOutsourcedPart.fxml'.";
        assert outsourcedButton != null : "fx:id=\"outsourcedButton\" was not injected: check your FXML file 'AddModifyOutsourcedPart.fxml'.";
        assert partMachOrCompLabel != null : "fx:id=\"partMachOrCompLabel\" was not injected: check your FXML file 'AddModifyOutsourcedPart.fxml'.";
        assert partIdbox != null : "fx:id=\"partIdbox\" was not injected: check your FXML file 'AddModifyOutsourcedPart.fxml'.";
        assert partNameBox != null : "fx:id=\"partNameBox\" was not injected: check your FXML file 'AddModifyOutsourcedPart.fxml'.";
        assert partInventoryBox != null : "fx:id=\"partInventoryBox\" was not injected: check your FXML file 'AddModifyOutsourcedPart.fxml'.";
        assert partCostBox != null : "fx:id=\"partCostBox\" was not injected: check your FXML file 'AddModifyOutsourcedPart.fxml'.";
        assert partMachineOrCompBox != null : "fx:id=\"partMachineOrCompBox\" was not injected: check your FXML file 'AddModifyOutsourcedPart.fxml'.";
        assert partMaxBox != null : "fx:id=\"partMaxBox\" was not injected: check your FXML file 'AddModifyOutsourcedPart.fxml'.";
        assert partMinBox != null : "fx:id=\"partMinBox\" was not injected: check your FXML file 'AddModifyOutsourcedPart.fxml'.";
        outsourcedButton.setSelected(true);
        inHouseButton.setSelected(false);
    }
    
    @FXML
    private void InHouseScreenHandler(ActionEvent event) throws IOException{
        Stage stage;
        Parent root;
        stage=(Stage) inHouseButton.getScene().getWindow();
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddModifyInhousePart.fxml"));
        root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        AddModifyInhousePartController controller = loader.getController();
        
    }
}
