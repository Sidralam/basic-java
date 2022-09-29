package com.syntax.class01;

import java.util.Scanner;

public class LongSpecialist {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("How much loan do you need");
		int amount=scanner.nextInt();
		if(amount<=200000) {
			System.out.println("your loan is approved");
		}
		else {
			System.out.println("your loan is rejected");
		}

	}

}
