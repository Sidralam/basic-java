package com.syntax.class01;

import java.util.Scanner;

public class LogicalOperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter first number");
		double a=input.nextInt();
		System.out.println("Please enter second number");
		double b=input.nextInt();
		System.out.println("Please enter one of the following operatures + _ * /");
		char operator = input.next().charAt(0);
		double result=0.0;
		switch (operator) {
		case '+':
			result = a+b;
			break;
		case '-':
			result = a-b;
			break;
		case '*':
			result = a*b;
			break;
		case '/':
			result = a/b;
			break;
			
		
		}
		if (operator == '+' || operator == '-' || operator == '*' || operator =='/') {
			
		}else {
			System.out.println("Invalid number.please try again");
		}

	}

}
