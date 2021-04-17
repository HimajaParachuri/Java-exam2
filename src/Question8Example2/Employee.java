/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8Example2;

/**
 *
 * @author HIMAJA PARACHURI
 */
public class Employee extends Person{
    private int employeeId;
	
    
	public Employee(String nm, String gen, int id) {
		super(nm, gen);
		this.employeeId=id;
	}
        
        @Override
	public void status() {
		if(employeeId == 0){
			System.out.println("This employee ID is Invalid. The status is Not working\n");
		}else{
			System.out.println("This employee ID is Valid. the status is Working as employee\n");
		}
	}
        
        @Override
	public String toString(){
		return "Name: "+ getName() +"\nGender: "+ getGender() + "\nEmployee ID: " + employeeId;
	}
        
        public static void main(String args[]){
		
		Person p = new Employee("Hannah","Female",0);
                System.out.println(p.toString());
                p.status();
		Person p1 = new Employee("Paul Rudd","Male",123);
                System.out.println(p1.toString());
		p1.status();
	}
}
