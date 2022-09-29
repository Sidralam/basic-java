package com.syntax.class01;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is the city");
		String city=scanner.nextLine();
		System.out.println("What is the temperature of your city");
		double Temperature=scanner.nextDouble();
		double celsius=(Temperature-32)*5/9;
		System.out.println("The temperature in the "+city+ " is "+ celsius);
		
		
		
		

	}

}
