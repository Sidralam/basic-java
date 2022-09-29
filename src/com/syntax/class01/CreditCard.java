package com.syntax.class01;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you have a credit card");
		
		Boolean Creditcard=scanner.nextBoolean();
		if(Creditcard){
			System.out.println("What is the balance on your card");
		}
		int balance=scanner.nextInt();
		if(balance>1000) {
			System.out.println("you have to pay off immediatly");
			
		}else {
			System.out.println("You can spend more");
			
		

	}
		
	}
	
		
	}
		
	
		
	


