package com.syntax.class01;

public class ArraysDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] dresses=new String[] {"pink Dress", "cocktail","Summer Dress","Night dress","Office Dress"};
		//Last index is always size-1 because arrays
		//Index start from zero
		System.out.println(dresses.length);
		
		for(int i=0; i<dresses.length; i++) {
			System.out.println("Lets try " + dresses[i]);
		}
		//Enhance for loop
		for(String dress:dresses) {
			System.out.println(dress);
		}
		

	}

}
