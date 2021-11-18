/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author kshit
 */
public class RestaurantItems {
    private String itemName;
    private double itemPrice;
    
     public RestaurantItems(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    
    @Override
    public String toString() {
        return this.itemName;
    }   
    
}
