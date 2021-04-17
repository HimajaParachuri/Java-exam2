/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4.Polymorphism1;

/**
 *
 * @author HIMAJA PARACHURI
 */
public class DerivedClass extends BaseClass{
       
    
    @Override
    public void display(){
        System.out.println("Hi from the Child/Derived Class!!");
    }
    
    
    public void sum(int x, int y, int z){
        int output = x+y+z;
         System.out.println("The sum of 3 integer is (overloaded method): "+output +"\n");
    }
    
    
    public static void main(String[] args) {
        
        System.out.println("Demonstration on Method Overloading/Static polymorphism");
        BaseClass b = new BaseClass();
        b.sum(15, 25);
        DerivedClass d = new DerivedClass();
        d.sum(10,20,30);
        System.out.println("\nDemonstration on Method overriding/Dynamic polymorphism");
        b.display();
        d.display();
    }
}
        
        
    