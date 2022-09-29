package com.syntax.class01;

public class LoopDifferentways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print numbers from 1 to 100 in one line with space
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		System.out.println("------------");
		//Print numbers from 100 to 1
		for(int a=100; a>=1; a--) {
			System.out.print(a+" ");
		}
		System.out.println("--------------");
		//Print even numbers from 20 to 1
		int i=20;
		while(i>=1) {
			System.out.print(i+" ");
			i-=2;
		}
		

	}

}
