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
public class Faculty extends Employee{
    
    int offHours;
    int noOfSubjects;

    public Faculty(int offHours, int noOfSubjects, String office, double salary, String datehired, String name, String Address, String phoneNumber, String email) {
        super(office, salary, datehired, name, Address, phoneNumber, email);
        this.offHours = offHours;
        this.noOfSubjects = noOfSubjects;
    }
     @Override
    public String toString() {
        return "\nFaculty Class: " + "\nName=" + name + "\nOffice Hours=" + offHours + "\nNumber of Subjects=" + noOfSubjects 
                +"\nDate Hired=" + datehired + "\nAddress=" + Address + "\nPhone number=" + phoneNumber +"\nEmail=" + email;
    }
    
    
}