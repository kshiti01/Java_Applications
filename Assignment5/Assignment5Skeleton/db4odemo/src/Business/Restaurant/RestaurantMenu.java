/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author Pranali
 */
public class RestaurantMenu {
    ArrayList<RestaurantItems> itemList = new ArrayList<RestaurantItems>();

    public ArrayList<RestaurantItems> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<RestaurantItems> itemList) {
        this.itemList = itemList;
    }
    
    public void addItems(RestaurantItems items){
        itemList.add(items);
    }
    
    public void removeItems(RestaurantItems items){
        itemList.remove(items);
    }
    
}
