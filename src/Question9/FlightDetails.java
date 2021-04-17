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
public class FlightDetails implements FlightOpeartions{
    
    String name;
    int age;
    String FlightName;

    public FlightDetails(String name, int age, String FlightName) {
        this.name = name;
        this.age = age;
        this.FlightName = FlightName;
    }
   
    @Override
    public void takeoff() {
        System.out.println("TakeOFF: Flight Departed!!");
    }

    @Override
    public void fly() {
        System.out.println("Fly: Flight is on Air!!");
    }

    @Override
    public void land() {
       System.out.println("Land: Flight is about to Land!!");
    }

    @Override
    public String toString() {
        return "The Pilot Details are: " + "\nPilot Name= " + name + "\nPilot Age= " + age 
                + "\nFlight Name= " + FlightName ;
    }
    
    
    
}
