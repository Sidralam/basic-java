package com.syntax.class01;

public class ArrayClass9HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HW#3. Create an array on integers and calculate the sum of all elements in an
        // array

        int[] numbers = { 12, 56, 345, 1, 0, 9 };

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];

        }
        System.out.println(sum);

	}

}
