package com.syntax.class01;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter a number");
		int number=scanner.nextInt();
		if(number>1 || number<10) {
		System.out.println("Small");
		}else if(number>10 || number<100){ 
			System.out.println("");
		}else if(number>101 || number<1000){
			System.out.println("large");
		}
		
		

	}
}