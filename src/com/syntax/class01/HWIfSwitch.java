package com.syntax.class01;

import java.util.Scanner;

public class HWIfSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner=new Scanner(System.in);
			System.out.println("Please enter the first number");
			
			String num1=scanner.nextLine();
			System.out.println("please enter the second number");
			
			String num2=scanner.nextLine();
			System.out.println("please choose the operation");
			
			char operation=scanner.next().charAt(0);
			int result=0;
			
			if(operation=='+') {
				System.out.println("num1=num2");
			}else if(operation=='-') {
				System.out.println("num1-num2");
			}else if(operation=='*') {
				System.out.println("num1*num2");
			}else if(operation=='/') {
				System.out.println("num1/num2");
			}else {
				System.out.println("invalid");
			}
			System.out.println("The result will be" +result);
			
			
	}
	
			

	}


