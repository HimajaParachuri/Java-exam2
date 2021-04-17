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
public class DriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee e;
        e= new Employee("Robert", "Mexico", 25);
        e.display();
        Salary s = new Salary("Charles", "Washington", 27);
        int getSalary = s.getSalary(95000);
        e=s;
        e.display();
        double salary = s.computePay();
        System.out.println("Salary of the Employee per month: "+salary);
       
    }
}
