package com.syntax.class01;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("How tall you are?");
		double height=input.nextDouble();
		if(height>=60) {
			System.out.println("Short");
			
		}else if(height>60 || height<72) {
			System.out.println("You are medium");
		}else if(height>72) {
			System.out.println("You are tall");
		}
			
			
		
	

	}

}
