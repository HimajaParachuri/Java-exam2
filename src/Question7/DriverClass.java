/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import java.util.EnumMap;
import java.util.Map;

/**
 *
 * @author HIMAJA PARACHURI
 */
public class DriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Map<Drink, Integer> em = new EnumMap<Drink, Integer>(Drink.class);
       
       for(Drink d : Drink.values()){
           em.put(d, 5);
       }
        System.out.println("The drink details and the price are given below: \n");
       
       for(Map.Entry<Drink, Integer> entry: em.entrySet()){
           
           int totalPrice = entry.getKey().getPrice()*entry.getValue();
           
            System.out.println("Drink Name: " +entry.getKey().getTitle()
                    + "\nQuantity : " + entry.getValue() 
                    +"\nPrice: " + entry.getKey().getPrice()
                  + "\nTotal Price: " + totalPrice +"\n");
    }
      
    }
}
    
