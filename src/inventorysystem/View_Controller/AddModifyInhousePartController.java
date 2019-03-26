/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem.View_Controller;

import inventorysystem.Model.InhousePart;
import inventorysystem.Model.OutsourcedPart;
import inventorysystem.Model.Part;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddModifyInhousePartController {
    
    private InhousePart part;
    private ObservableList<Part> partList;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="addModifyPartLabel"
    private Label addModifyPartLabel; // Value injected by FXMLLoader

    @FXML // fx:id="inhouseButton"
    private RadioButton inhouseButton; // Value injected by FXMLLoader

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
    
    @FXML // fx:id="btnCancel"
    private Button btnCancel; // Value injected by FXMLLoader

    @FXML // fx:id="btnSave"
    private Button btnSave; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert addModifyPartLabel != null : "fx:id=\"addModifyPartLabel\" was not injected: check your FXML file 'AddModifyInhousePart.fxml'.";
        assert inhouseButton != null : "fx:id=\"inhouseButton\" was not injected: check your FXML file 'AddModifyInhousePart.fxml'.";
        assert outsourcedButton != null : "fx:id=\"outsourcedButton\" was not injected: check your FXML file 'AddModifyInhousePart.fxml'.";
        assert partMachOrCompLabel != null : "fx:id=\"partMachOrCompLabel\" was not injected: check your FXML file 'AddModifyInhousePart.fxml'.";
        assert partIdbox != null : "fx:id=\"partIdbox\" was not injected: check your FXML file 'AddModifyInhousePart.fxml'.";
        assert partNameBox != null : "fx:id=\"partNameBox\" was not injected: check your FXML file 'AddModifyInhousePart.fxml'.";
        assert partInventoryBox != null : "fx:id=\"partInventoryBox\" was not injected: check your FXML file 'AddModifyInhousePart.fxml'.";
        assert partCostBox != null : "fx:id=\"partCostBox\" was not injected: check your FXML file 'AddModifyInhousePart.fxml'.";
        assert partMachineOrCompBox != null : "fx:id=\"partMachineOrCompBox\" was not injected: check your FXML file 'AddModifyInhousePart.fxml'.";
        assert partMaxBox != null : "fx:id=\"partMaxBox\" was not injected: check your FXML file 'AddModifyInhousePart.fxml'.";
        assert partMinBox != null : "fx:id=\"partMinBox\" was not injected: check your FXML file 'AddModifyInhousePart.fxml'.";
        assert btnCancel != null : "fx:id=\"btnCancel\" was not injected: check your FXML file 'AddModifyInhousePart.fxml'.";
        assert btnSave != null : "fx:id=\"btnSave\" was not injected: check your FXML file 'AddModifyInhousePart.fxml'.";
        part = new InhousePart();
        inhouseButton.setSelected(true);
        outsourcedButton.setSelected(false);
    }
    
    public void SetPart(Part partArg){
        part = (InhousePart) partArg;
        partIdbox.setText(Integer.toString(part.getPartID()));
        partNameBox.setText(part.getName());
        partInventoryBox.setText(Integer.toString(part.getInStock()));
        partCostBox.setText(Double.toString(part.getPrice()));
        partMaxBox.setText(Integer.toString(part.getMax()));
        partMinBox.setText(Integer.toString(part.getMin()));
    }
    
    public void SetPartList(ObservableList<Part> list){
        partList = list;
    }
    
    @FXML
    private void OutsourcedScreenHandler(ActionEvent event) throws IOException{
        OutsourcedPart part = new OutsourcedPart();
        part.setInStock(!partInventoryBox.getText().isEmpty() ? Integer.parseInt(partInventoryBox.getText()) : 0);
        part.setName(partNameBox.getText());
        part.setMin(!partMinBox.getText().isEmpty() ? Integer.parseInt(partMinBox.getText()) : 0);
        part.setMax(!partMaxBox.getText().isEmpty() ? Integer.parseInt(partMaxBox.getText()) : 0);
        part.setPrice(!partCostBox.getText().isEmpty() ? Double.parseDouble(partCostBox.getText()) : 0);
        part.setPartID(!partIdbox.getText().isEmpty() ? Integer.parseInt(partIdbox.getText()) : 0);
        Stage stage;
        Parent root;
        stage=(Stage) outsourcedButton.getScene().getWindow();
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddModifyOutsourcedPart.fxml"));
        root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        AddModifyOutsourcedPartController controller = loader.getController();
        controller.SetPart(part);
        controller.SetPartList(partList);
    }
    
    @FXML
    private void Cancel(ActionEvent event){
        Stage stage = (Stage)btnCancel.getScene().getWindow();
        stage.close();
    }
    
    @FXML
    private void Save(ActionEvent event){
        if (ValidateInventory()) {
            InhousePart savePart = new InhousePart();
            savePart.setInStock(!partInventoryBox.getText().isEmpty() ? Integer.parseInt(partInventoryBox.getText()) : 0);
            savePart.setName(partNameBox.getText());
            savePart.setMin(!partMinBox.getText().isEmpty() ? Integer.parseInt(partMinBox.getText()) : 0);
            savePart.setMax(!partMaxBox.getText().isEmpty() ? Integer.parseInt(partMaxBox.getText()) : 0);
            savePart.setPrice(!partCostBox.getText().isEmpty() ? Double.parseDouble(partCostBox.getText()) : 0);
            savePart.setPartID(!partIdbox.getText().isEmpty() ? Integer.parseInt(partIdbox.getText()) : 0);
            savePart.setMachineID(!partMachineOrCompBox.getText().isEmpty() ? Integer.parseInt(partMachineOrCompBox.getText()):0);
            partList.add(savePart);
            Stage stage = (Stage)btnSave.getScene().getWindow();
            stage.close();
        }
    }
    
    private Boolean ValidateInventory(){
        Integer min = !partMinBox.getText().isEmpty() ? Integer.parseInt(partMinBox.getText()) : 0;
        Integer max = !partMaxBox.getText().isEmpty() ? Integer.parseInt(partMaxBox.getText()) : 0;
        Integer inventory = !partInventoryBox.getText().isEmpty() ? Integer.parseInt(partInventoryBox.getText()) : 0;
        Boolean result = (min < inventory & inventory < max);
        if (!result) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Warning - Invalid EntriesS");
            alert.setHeaderText("Invalid inventory, minimum, or maximum values");
            alert.setContentText("Inventory must be between Min and Max values, and Min must be less than max.");

            alert.showAndWait();
        }
        return result;
    }
}

