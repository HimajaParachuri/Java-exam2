/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4.Inheritance1;

/**
 *
 * @author HIMAJA PARACHURI
 */
public class Student extends person {

    //Variable declarations
    int score = 95;
    String University = "Northwest Missouri State University";
    String Subject = "Java";


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereStudent 
        Student stu = new Student();
        System.out.println("The student details are given below \n");
        System.out.println("Name: " + stu.name);
        System.out.println("Age: " + stu.age);
        System.out.println("Address: " + stu.address);
        System.out.println("Subject: " + stu.Subject);
        System.out.println("Score: " + stu.score);
        System.out.println("Univeristy: " + stu.University);
    }
}
