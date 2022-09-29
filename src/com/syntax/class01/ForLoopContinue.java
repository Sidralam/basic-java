package com.syntax.class01;

public class ForLoopContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<5; i++) {
			if(i==3) {
				continue;
			}
			System.out.println("Hello");
			System.out.println("How are you");
			System.out.println(i);
			
			
		}
		// I want to print from 1 to 20 except number 3,7 and 8
		for(int i=1; i<=20; i++) {
			if(i==3 || i==7 ||i==8) {
				continue;
			}
			System.out.print(i+" ");
			
		}
		//Continue - Continue to the next iteration/cycle
		//moment java sees continue-> it goes back to the beginning of the loop
		//Usually used inside some types of conditions.

	}

}
