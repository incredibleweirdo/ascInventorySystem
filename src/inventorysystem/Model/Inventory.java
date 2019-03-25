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
    
    public boolean removeProduct(int productId){
        return false;
    }
    
    public Product lookupProduct(int productId){
        return null;
    }
    
    public void updateProduct(int productId){
        
    }
    
    public void addPart(Part newPart){
        allParts.add(newPart);
    }
    
    public boolean deletePart(Part part){
        return allParts.remove(part);
    }
    
    public Part lookupPart(int partId){
        return null;
    }
    
    public void updatePart(int partId){
        
    }
}
