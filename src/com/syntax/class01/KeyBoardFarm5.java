package com.syntax.class01;

import java.util.Scanner;

public class KeyBoardFarm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Did you solve repl assignment please enter true or false");
		boolean solveAnyRapl=scanner.nextBoolean();
		if(solveAnyRapl) {
			System.out.println("How many rapl you solve");
			int NoRaplSolved=scanner.nextInt();
			if (NoRaplSolved>17) {
				System.out.println("you are doing great");
			}
			else if(NoRaplSolved>10) {
				
			}
			else {
				System.out.println("You should solve some more");
			}
		}

	}

}
