package com.syntax.class01;

public class ArrayClass9HW5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array of animals and store 5 elements into it.
		//Using two different loops print all elements from the array.
		String [] animal = {"Horse", "Dog","Lion", "Wolf", "Cat"};
		for(int a=0; a<animal.length; a++) {
			System.out.println(animal[a]);
		}
		System.out.println("******************");
		//Method 2
		String [] animals = {"Horse", "Dog","Lion", "Wolf", "Cat"};
		for(String a:animals){
			System.out.println(a);
		}
		
		

	}

}
