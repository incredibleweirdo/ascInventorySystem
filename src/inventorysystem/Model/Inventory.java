/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem.Model;

import java.util.ArrayList;

/**
 *
 * @author anthonyscary
 */
public class Inventory {
    public ArrayList<Product> products;
    public ArrayList<Part> allParts;
    
    public void addProduct(Product product){
        
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
        
    }
    
    public boolean deletePart(Part part){
        return false;
    }
    
    public Part lookupPart(int partId){
        return null;
    }
    
    public void updatePart(int partId){
        
    }
}
