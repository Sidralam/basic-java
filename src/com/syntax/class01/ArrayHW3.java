package com.syntax.class01;

public class ArrayHW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {10,90,60,80};
        int largestNum=0;

        for(int i=0 ; i<num.length; i++) {
        if(num[i]>largestNum) {
            largestNum=num[i]; //store the  num elements in largestNum
            }
    }
        System.out.println("The largest num among the array elements is " + largestNum + "!");
}

	}


