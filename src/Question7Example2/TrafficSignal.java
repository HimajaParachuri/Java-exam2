/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7Example2;

/**
 *
 * @author HIMAJA PARACHURI
 */
public enum TrafficSignal {
RED(30), AMBER(10), GREEN(30);

    private final int seconds;      

    TrafficSignal(int seconds) {     
        this.seconds = seconds;
    }

    int getSeconds() {              
        return seconds;
    }
}
