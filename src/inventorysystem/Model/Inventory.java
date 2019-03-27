/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author anthonyscary
 */
public class Inventory {
    public ObservableList<Product> products;
    public ObservableList<Part> allParts;

    public Inventory() {
        products = FXCollections.observableArrayList();
        allParts = FXCollections.observableArrayList();
    }
    
    public void addProduct(Product product){
        products.add(product);
    }
    
    public boolean removeProduct(int productID){
        return products.removeIf(p -> p.getProductID() == productID);
    }
    
    public Product lookupProduct(int productID){
        return products.stream().filter(p -> p.getProductID() == productID).findFirst().orElse(null);
    }
    
    public void updateProduct(int productID){
        
    }
    
    public void updateProduct(Product product){
        
    }
    
    public void addPart(Part newPart){
        allParts.add(newPart);
    }
    
    public boolean deletePart(Part part){
        return allParts.remove(part);
    }
    
    public Part lookupPart(int partID){
        return allParts.stream().filter(p -> p.getPartID() == partID).findFirst().orElse(null);
    }
    
    public void updatePart(int partID){
        
    }
    
    public void updatePart(Part part){
        
    }
}
