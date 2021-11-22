/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
   
    ArrayList<DeliveryMan> ListOfDeliveryMan;
    
    public DeliveryManDirectory(){
        ListOfDeliveryMan = new ArrayList<>();
    }

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return ListOfDeliveryMan;
    }
    
    public ArrayList<DeliveryMan> addDeliveryMan(DeliveryMan deliveryMan){
        
        ListOfDeliveryMan.add(deliveryMan);
        return ListOfDeliveryMan;
    }
    public void removeDeliveryMan(DeliveryMan deliveryMan){
        ListOfDeliveryMan.remove(deliveryMan);
    }
    
}
