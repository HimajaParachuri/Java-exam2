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
public class Square extends Shape {

    Square(double side) {
        length = side;
    }

    @Override
    public double area() {
        return length * length;
    }
}
