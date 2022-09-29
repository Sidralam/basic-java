package com.syntax.class01;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<3; i++) {//--> outer loop controls inner loop
			System.out.println("Hello");
			for(int j=1; j>=3; j++ ) {//-->Inner loop depends on outer loop
				System.out.println("Bye");
			}
		}
		System.out.println("End of the code");

	}

}
