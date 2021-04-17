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
public class Salary extends Employee {

    private double salary; 
    public Salary(String name, String address, int age) {
        super(name, address, age);
        
    }

    @Override
    public void display() {
        System.out.println("Details of the Employee: ");
        System.out.println("Name: "+ getName() + "\nAge: " + getAge() 
                + "\nAddress: "+ getAddress() +"\nSalary " + salary +"\n");
    }
    
    public int getSalary(int salary){
        this.salary = salary;
        return salary;
    }
 
    public double computePay() {
        System.out.println("Computing salary pay for " + getName()+": ");
        return salary / 12;
    }
}