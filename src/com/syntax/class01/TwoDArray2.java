package com.syntax.class01;

public class TwoDArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] countries = {
				{"USA","Canada"},//1 array with index 0
				{"Peru","Brazil","Columbia","Pakistan"},//2 array with index 1
				{"Ethiopia","Egypt","Kenya"},
				{"Germany","Turkiye","Ukraine","England"},
				{"Korea","Japan","China"},
		};
		System.out.println(countries.length);//5-total = of arrays or rows
		int el0flarrr =countries[0].length;
		System.out.println("# of elements from 1 array =" +el0flarrr);
		int el0f2arrr = countries[1].length;
		System.out.println("# of elements from 2 array =" +el0f2arrr);

	}

}
