package com.syntax.class01;

public class Employee {
    String name;
	String ID;
	String Department;
	double salary;
	String Shift;
	
	void work() {
		System.out.println(name+ " is working on shift"+Shift);

	}
	public static void main(String[]args) {
		Employee emp1 = new Employee();
		emp1.name = "John";
		emp1.ID = "123";
		emp1.Department = "IT";
		emp1.salary = 2000000;
		emp1.Shift = " Evening";
		emp1.work();
		
		
		Employee emp2 = new Employee();
		emp2.name ="Adam";
		emp2.Department = "Sales";
		emp2.ID = "456A";
		emp2.salary = 1500000;
		emp2.Shift = " Morning";
		emp2.work();
		
		
	}

}
