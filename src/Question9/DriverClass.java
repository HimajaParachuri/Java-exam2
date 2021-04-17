/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

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
     FlightDetails p = new FlightDetails("Paul", 27, "Air India");
        System.out.println("The flight Operation details are given below: \n");
        
        System.out.println(p);
        
        System.out.println("\nThe Flight Operation status are:");
        p.takeoff();
        p.fly();
        p.land();
        
    }
}
