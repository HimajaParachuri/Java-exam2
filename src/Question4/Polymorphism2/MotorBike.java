/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4.Polymorphism2;

/**
 *
 * @author HIMAJA PARACHURI
 */
public class MotorBike extends Vehicle {

    //Overriden Method
    @Override
    public void move() {
        super.move(); // calls the parent class method because of "super" keyword
        System.out.println("From Child Class: MotorBike can move and accelerate too!!");
    }
    
    
    public void horn(int intensity){
        System.out.println("From Child Class: Car blaring its horn at "+intensity+"dB.");
    }

    public static void main(String[] args) {
        Vehicle vh = new MotorBike();
        System.out.println("Demonstration on Dynamic Polymorphism \n");
        vh.move();    
        vh = new Vehicle();
        vh.move();    
        System.out.println("\nDemonstration on Static Polymorphism \n");
        Vehicle v = new Vehicle();
        v.horn();
        MotorBike mb = new MotorBike();
        mb.horn(100);
       
    }

}