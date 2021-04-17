/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4.LateBindingPolymorphism2;

/**
 *
 * @author HIMAJA PARACHURI
 */
public class Employee {
    private String name;
    private String address;
    private int age;
    
    public Employee(String name, String address, int age) {
        System.out.println("Constructing an Employee\n");
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void display() {
        System.out.println("Details of the Employee: " + "\nName: "+this.name +"\nAge: "+this.age
                + "\nAddress:" + this.address +"\n");
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    
}