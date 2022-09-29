package com.syntax.class01;

import java.util.Scanner;

public class CountryHWTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Which country you are from");
		String country=input.nextLine();
		String language = null;
		switch(country) {
		case "USA":
			language = "English";
			break;
		case "pakistan":
			language = "Urdu";
			break;
		case "Turkey":
			language = "Turkish";
			break;
		case "Germany":
			language = "German";
			break;
			default:
				System.out.println("Entered dar=ta is invalid");
			
		}
		System.out.println("You are from " + country+ " and your language is " + language);

	}

}
