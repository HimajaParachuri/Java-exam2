/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4.Inheritance2;

/**
 *
 * @author HIMAJA PARACHURI
 */
public class Department extends Faculty{
    
    double Bonus;
    String department;

    
    public Department(double Bonus, String department, String name, double salary) {
        super(name, salary);
        this.Bonus = Bonus;
        this.department = department;
    }
    
    
    public double totalSalary(double salary, double bonus){
        double ts = salary + bonus;
        return ts;
    }

    
    @Override
    public String toString() {
        return  "\nName: "+ name +"\nDepartment: " + department+ "\nSalary: "+ salary +"\nBonus=" + Bonus
                +"\nTotal Salary: " + totalSalary(salary, Bonus) ;
    }
    
    
    
    public static void main(String[] args) {
        Department d = new Department(200, "Java", "David", 5000);
        
        System.out.println("The details of the faculty is given below: " );
        System.out.println(d.toString());
       
    }
    
}

