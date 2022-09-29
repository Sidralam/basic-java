package com.syntax.class01;

import java.util.Scanner;

public class TaskHW5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("What is your  grade? A,b,C or D");
		char Grade =input.next().charAt(0);
		String explanation=null;
		switch(Grade) {
		
		case 'A':
			explanation="Great:A.Excellent! you might be able to teach this class";
			break;
		
		case 'B':
			explanation="Great:B. Good job";
			break;
		
		case 'C':
			explanation="Grade:C.This is an average grade please study more";
			break;
		case 'D':
			explanation="Grade:D. You are struggling in this class.please study course carriculam";
			break;
		case 'F':
			explanation="Grade:F.You are fail.you will repeat this class";
			break;
			default:
				explanation="not accebtable";
				
			
			
			
		
		
		
		
		}
		System.out.println("You current grade is"+explanation);
		
		

	}

}
