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
public class LateBindingClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Shape shape;
        Square square = new Square(10.0);
        Circle circle = new Circle(5.0); 
        shape = square;
        System.out.println("Area of Square is: " + shape.area());
        shape = circle; 
        System.out.println("Area of the circle is: "+shape.area()); 
    }
}
