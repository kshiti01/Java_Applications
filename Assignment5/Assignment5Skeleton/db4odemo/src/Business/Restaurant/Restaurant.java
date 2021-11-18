/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.DeliveryMan.DeliveryMan;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author kshit
 */
public class Restaurant extends UserAccount {
    private String orderId;
    private SystemAdminRole systemAdmin;
    private DeliveryMan deliveryMan;
    private String restaurantName;
    private String restaurantAddress;
    private String restaurantphone;
    private RestaurantMenu restaurantmenu;

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }
  

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public SystemAdminRole getSystemAdmin() {
        return systemAdmin;
    }

    public void setSystemAdmin(SystemAdminRole systemAdmin) {
        this.systemAdmin = systemAdmin;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }
    
     public String getRestaurantphone() {
        return restaurantphone;
    }

    public void setRestaurantphone(String restaurantphone) {
        this.restaurantphone = restaurantphone;
    }

     public RestaurantMenu getRestaurantmenu() {
        return restaurantmenu;
    }

    public void setRestaurantmenu(RestaurantMenu restaurantmenu) {
        this.restaurantmenu = restaurantmenu;
    }
   
    @Override
    public String toString() {
        return restaurantName;
    }
}
