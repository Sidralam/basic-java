package com.syntax.class01;

import java.util.Scanner;

public class Diploma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you have a diploma true or false");
		boolean diploma=scanner.nextBoolean();
		if(diploma) {
			System.out.println("Congratulations");
			System.out.println("What's your GpA score");
			double gpaScore=scanner.nextDouble();
			if(gpaScore>=3.5) {
				System.out.println("You are eligible for scholarship");
				
			}
			else {
				System.out.println("You should studied harder");
			}
				
		}
		else {
			System.out.println("Get a Degree");
		}

	

	}

}
