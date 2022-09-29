package com.syntax.class01;

public class WhileLoopTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=100;
		while(num>=1) {
			System.out.print(num + " ");
			num--;
		}
		System.out.println("---------");
		int a = 20;
		while(a<=100) {
			System.out.print(a+ " ");
			a+=2;
		}
		System.out.println("----------------");
		int b=100;
		while(b>=1) {
			if(b%3==0) {
				System.out.print(b + " ");
				
			}
			b++;
		}
		

	}

}
