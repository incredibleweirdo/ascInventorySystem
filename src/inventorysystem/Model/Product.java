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
public class Product {
    private int productID;
    private String name;
    private double price;
    private int inStock;
    private int min;
    private int max;
    private ArrayList<Part> associatedParts;

    /**
     * @return the productID
     */
    public int getProductID() {
        return productID;
    }

    /**
     * @param productID the productID to set
     */
    public void setProductID(int productID) {
        this.productID = productID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the inStock
     */
    public int getInStock() {
        return inStock;
    }

    /**
     * @param inStock the inStock to set
     */
    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    /**
     * @return the min
     */
    public int getMin() {
        return min;
    }

    /**
     * @param min the min to set
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * @return the max
     */
    public int getMax() {
        return max;
    }

    /**
     * @param max the max to set
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * @return the associatedParts
     */
    public ArrayList<Part> getAssociatedParts() {
        return associatedParts;
    }
    
    /**
     * 
     * @param part 
     */
    public void addAssociatedPart(Part part){
        
    }
    
    /**
     * 
     * @param partID
     * @return 
     */
    public boolean removeAssociatedPart(int partID){
        return false;
    }
    
    /**
     * 
     * @param partID
     * @return 
     */
    public Part lookupAssociatedPart(int partID){
        return null;
    }
}
