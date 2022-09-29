package com.syntax.class01;

public class SwitchCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char choice='Y';
		String answer;
		switch (choice) {
		case 'Y':
			answer = "yes";
			break;
		case'N':
			answer = "No";
			break;
		case'M':
			answer ="maybe";
			break;
			default:
				answer="Unknown";
				break;
		}
		System.out.println("answer");

	}

}
