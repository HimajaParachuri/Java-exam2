/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

/**
 *
 * @author HIMAJA PARACHURI
 */
public enum Drink {
 APPLE("Apple Juice", 75), ORANGE("Orange Juice", 75), SODA("Soda", 90), LIME("Lime", 50);

    
    private String title;
    private int price;
     private Drink(String title, int price) {
        this.title = title;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }  
    
}
