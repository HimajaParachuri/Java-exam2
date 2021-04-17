/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author HIMAJA PARACHURI
 */
public class Question3 {

    public static class Circle {

        double radius;
        final static double pi = 3.14;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public String toString() {
            return "Circle Class: \n" + "radius= " + radius
                    + " \nArea of the circle is " + pi * radius * radius;
        }

    }

    public static class Loan {

        double principle;
        double interest;
        int time;

        public Loan(double principle, double interest, int time) {
            this.principle = principle;
            this.interest = interest;
            this.time = time;
        }

        @Override
        public String toString() {
            return "Loan Class: \n" + "Principle= $" + principle + " \nInterest="
                    + " " + interest + " \nTime= " + time + " Years"
                    + " \nSimple interest is $" + (principle * interest * time) / 100;
        }

    }

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(new Loan(10000, 10.5, 3));
        al.add(new Date());
        al.add(new String("String class input "));
        al.add(new Circle(1.5));
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i).toString() + "\n");
        }

    }
}
