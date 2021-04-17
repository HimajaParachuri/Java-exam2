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
public class Staff extends Employee{
     
    String title;

    public Staff(String title, String office, double salary, String datehired, String name, String Address, String phoneNumber, String email) {
        super(office, salary, datehired, name, Address, phoneNumber, email);
        this.title = title;
    }

    @Override
    public String toString() {
        return "\nStaff Class: " + "\nName=" + name + "\nTitle=" + title +"\nOffice=" + office 
                +"\nDate Hired=" + datehired + "\nAddress=" + Address + "\nPhone number=" + phoneNumber +"\nEmail=" + email;
    }
}
    

    
    
    

