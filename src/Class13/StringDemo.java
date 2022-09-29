package Class13;

import java.util.Arrays;

public class StringDemo {

	private static long[] charArr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Today is sunday";
		String day = str.substring(9);
		System.out.println(day);
		System.out.println(str.substring(6,8));
		System.out.println(str.charAt(5));
		//calling the method charAt at string object
		char c = str.charAt(4);
		System.out.println();
		
		
		System.out.println(Arrays.toString(charArr));
		char[] charArr=str.toCharArray();
        System.out.println(charArr);

	}

}
