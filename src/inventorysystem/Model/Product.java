/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem.Model;

import java.util.ArrayList;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author anthonyscary
 */
public class Product {
    private final SimpleIntegerProperty productID = new SimpleIntegerProperty(0);
    private final SimpleStringProperty name = new SimpleStringProperty("");
    private final SimpleDoubleProperty price = new SimpleDoubleProperty(0.0);
    private final SimpleIntegerProperty inStock = new SimpleIntegerProperty(0);
    private final SimpleIntegerProperty min = new SimpleIntegerProperty(0);
    private final SimpleIntegerProperty max = new SimpleIntegerProperty(0);
    private final ArrayList<Part> associatedParts;

    public IntegerProperty productIdProperty(){
        return productID;
    }
    
    public StringProperty productNameProperty(){
        return name;
    }
    
    public DoubleProperty priceProperty(){
        return price;
    }
    
    public IntegerProperty inStockProperty(){
        return inStock;
    }
    
    public IntegerProperty minProperty(){
        return min;
    }
    
    public IntegerProperty maxProperty(){
        return max;
    }
    
    public Product() {
        this.associatedParts = new ArrayList<>();
    }

    public Product(int productID, String name, double price, int inStock, int min, int max, ArrayList<Part> associatedParts) {
        this.productID.set(productID);
        this.name.set(name);
        this.price.set(price);
        this.inStock.set(inStock);
        this.min.set(min);
        this.max.set(max);
        this.associatedParts = associatedParts;
    }

    
    /**
     * @return the productID
     */
    public int getProductID() {
        return productID.get();
    }

    /**
     * @param productID the productID to set
     */
    public void setProductID(int productID) {
        this.productID.set(productID);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name.get();
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name.set(name);
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price.get();
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price.set(price);
    }

    /**
     * @return the inStock
     */
    public int getInStock() {
        return inStock.get();
    }

    /**
     * @param inStock the inStock to set
     */
    public void setInStock(int inStock) {
        this.inStock.set(inStock);
    }

    /**
     * @return the min
     */
    public int getMin() {
        return min.get();
    }

    /**
     * @param min the min to set
     */
    public void setMin(int min) {
        this.min.set(min);
    }

    /**
     * @return the max
     */
    public int getMax() {
        return max.get();
    }

    /**
     * @param max the max to set
     */
    public void setMax(int max) {
        this.max.set(max);
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
        associatedParts.add(part);
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
