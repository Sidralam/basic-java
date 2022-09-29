package com.syntax.class01;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner=new Scanner(System.in);
		System.out.println("How many years have you worked");
		int years=Scanner.nextInt();
		if(years>=5) {
			System.out.println("You are eligible for the bonus");
			System.out.println("what is your annual salary");
			int salary=Scanner.nextInt();
			if (salary>=50000) {
				System.out.println("The bonus is equal 5000");
				
			}else {
				System.out.println("You are not eligible for the bonus");
				System.out.println("The bonus is 3000");
			}
		}

	}

}
