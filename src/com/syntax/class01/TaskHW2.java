package com.syntax.class01;

import java.util.Scanner;

public class TaskHW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your month name");
		String month=input.nextLine();
		if (month.equals("March") ||month.equals("April")||month.equals("May")) {
			System.out.println("Spring");
			
		}else if(month.equals("June") || month.equals("July") || month.equals("August")) {
		System.out.println("Summer");
		
			
		}else if(month.equals("September") || month.equals("October") ||month.equals("Novembe")) {
			System.out.println("Fall");
		}else if(month.equals("December") ||month.equals("January") || month.equals("February")) {
			System.out.println("winter");
		}else {
			System.out.println("Invalid month");
		}

	}

}
