/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author HIMAJA PARACHURI
 */
public class Student extends Person {

    int grade;
    final static String status = "Graduate";

    public Student(int grade, String name, String Address, String phoneNumber, String email) {
        super(name, Address, phoneNumber, email);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "\nStudent Class: " + "\nName=" + name + "\nGrade=" + grade +"\nStatus=" + status
                +"\nAddress="+ Address + "\nPhone Number=" + phoneNumber +"\nEmail=" + email;
    }
}
