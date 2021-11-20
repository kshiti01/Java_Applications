/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Restaurant.RestaurantItems;

/**
 *
 * @author kshit
 */
public class QuantityOfItems {
    RestaurantItems item;
    
    int quantity;

    public QuantityOfItems(RestaurantItems item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public RestaurantItems getItem() {
        return item;
    }

    public void setItem(RestaurantItems item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantilty(int quantity) {
        this.quantity = quantity;
    }
    
    public String toString(){
        if(item != null){
            return item.getItemName();
        }else{
          return "No Name";  
        } 
    }
   
}

