package com.syntax.class01;

import java.util.Scanner;

public class Mortgage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is your mortgage rate");
		double mortgageRate=scanner.nextDouble();
		if(mortgageRate>=4.5) {
			System.out.println("you should not buy a house");
			
		}else {
			System.out.println("what is the price of the house");
			int price=scanner.nextInt();
			if(price>200000) {
				System.out.println("Will take a loan");
				
			}else {
				System.out.println("will pay cash");
			}
			
		}
		

	}

}
