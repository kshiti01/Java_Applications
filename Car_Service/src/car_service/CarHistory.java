/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_service;

import java.util.ArrayList;

/**
 *
 * @author kshit
 */
public class CarHistory {
 
    private ArrayList<Car> history;
    
    
    public CarHistory(){
        
        this.history = new ArrayList<Car>();
    }

    public ArrayList<Car> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Car> history) {
        this.history = history;
    }
    
    public Car addNewCar(){
        Car newCar = new Car();
        history.add(newCar);
        return newCar;
        
    }
    
    public void deleteCar(Car cr){
        history.remove(cr);
    }
    
}
