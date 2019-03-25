/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem.Model;

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
public abstract class Part {
    
    private final SimpleIntegerProperty partId = new SimpleIntegerProperty(0);
    private final SimpleStringProperty name = new SimpleStringProperty("");
    private final SimpleDoubleProperty price = new SimpleDoubleProperty(0);
    private final SimpleIntegerProperty inStock = new SimpleIntegerProperty(0);
    private final SimpleIntegerProperty min = new SimpleIntegerProperty(0);
    private final SimpleIntegerProperty max = new SimpleIntegerProperty(0);

    public IntegerProperty partIdProperty(){
        return partId;
    }
    
    public StringProperty nameProperty(){
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
    /**
     * @return the partID
     */
    public int getPartID() {
        return partId.get();
    }

    /**
     * @param partID the partID to set
     */
    public void setPartID(int partID) {
        this.partId.set(partID);
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
}
