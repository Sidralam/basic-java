package com.syntax.class01;

public class Class9HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] cars= {"Acura" , "BMW" , "Ford" , "Mercedes" , "Nissan" , "Honda"};
		
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
			
	}
		System.out.println("*******************");
		//Method 2
		String [] cars1= {"Acura" , "BMW" , "Ford" , "Mercedes" , "Nissan" , "Honda"};
		
	for(String a:cars1) {
		System.out.println(a);
		
		
	}

	}

}
