package com.syntax.class01;

public class Recape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Explicit/narrowing/manual
		//As we can,t fit 129 in byte we will get wrong results
		short largerBox=127;
		byte SmallerBox=(byte)largerBox;
		System.out.println(SmallerBox);
		
		//Explicit/narrowing/Manual
		//As we can fit 129 in short we will get proper result
		
		int largerBox1 =129;
		short SmallerBox2=(short)largerBox1;
		System.out.println(SmallerBox2);

	}

}
