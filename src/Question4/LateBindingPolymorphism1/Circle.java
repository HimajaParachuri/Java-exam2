/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4.LateBindingPolymorphism1;

/**
 *
 * @author HIMAJA PARACHURI
 */
public class Circle extends Shape {

    
    Circle(double radius) {
        length = radius ;
    }
    
   
    @Override
    public double area() {
        
       return (22 / 7) * length * length;
    }
}
