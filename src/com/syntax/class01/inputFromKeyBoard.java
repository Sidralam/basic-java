package com.syntax.class01;

import java.util.Scanner;

public class inputFromKeyBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner is a class that helps us take the input from the keyboard
		 * it contains many different smaller modules called methods that can help
		 * us take string boolean basically all types of data from the keyboard.
		 */
		Scanner input=new Scanner(System.in);
		//*A message will be displayed to the user on the console 
		//to enter his/her name
		System.out.println("please enter your name");
		//*Activate he java program to take the input from the keyboard
		//and store it inside
		
		String name=input.next();
		System.out.println("hello"+ name);

	}

}
