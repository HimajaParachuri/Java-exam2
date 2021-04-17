/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

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
     Addition a = new Addition();
        Substraction s = new Substraction();
        Multiplication m = new Multiplication();
        System.out.println("The results of Abstract Class implementations are given below: \n");
        a.calculate(10, 20);
        s.calculate(25, 10);
        m.calculate(10, 10);
    }
}
