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
        return products.removeIf(p -> p.getProductID() == productId);
    }
    
    public Product lookupProduct(int productId){
        return products.stream().filter(p -> p.getProductID() == productId).findFirst().orElse(null);
    }
    
    public void updateProduct(int productId){
        
    }
    
    public void updateProduct(Product product){
        
    }
    
    public void addPart(Part newPart){
        allParts.add(newPart);
    }
    
    public boolean deletePart(Part part){
        return allParts.remove(part);
    }
    
    public Part lookupPart(int partId){
        return allParts.stream().filter(p -> p.getPartID() == partId).findFirst().orElse(null);
    }
    
    public void updatePart(int partId){
        
    }
    
    public void updatePart(Part part){
        
    }
}
