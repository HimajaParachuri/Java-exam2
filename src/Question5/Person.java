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
public class Person {
    String name;
    String Address;
    String phoneNumber;
    String email;

    public Person(String name, String Address, String phoneNumber, String email) {
        this.name = name;
        this.Address = Address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }   
    

    @Override
    public String toString() {
        return "Person Class: " + "\nName=" + name + "\nAddress=" + Address + "\nPhone Number=" + phoneNumber 
                + "\nEmail=" + email ;
    }

}
