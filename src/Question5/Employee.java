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
public class Employee extends Person{
    
    String office;
    double salary;
    String datehired;

    public Employee(String office, double salary, String datehired, String name, String Address, String phoneNumber, String email) {
        super(name, Address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.datehired = datehired;
    }
    @Override
    public String toString() {
        return "\nEmployee Class: " + "\nName=" + name+ "\nOffice=" + office + "\nSalary=" + salary + "\nDate Hired=" + datehired
                +"\nAddress=" + Address + "\nPhone number=" + phoneNumber + "\nEmail=" + email;
    }
    
    
}
