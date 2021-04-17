/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import java.util.Scanner;

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
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of the Triangle: ");
        System.out.print("Enter side 1: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3: ");
        double side3 = sc.nextDouble();
        System.out.print("Choose the Color: ");
        String color = sc.next();
        System.out.print("Is Triangle filled? true/false: ");
        boolean filled = sc.nextBoolean();
        Triangle t = new Triangle(side1, side2, side3, color, filled);
        System.out.println("\nThe results are: ");
        System.out.println(t);
    }
}
