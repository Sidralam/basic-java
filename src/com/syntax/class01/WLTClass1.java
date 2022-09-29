package com.syntax.class01;

public class WLTClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int oddsum=0;
			int evensum=0;
			for(int i=1;i<=50;i++) {
				if(i%2==0) {
					evensum=i+evensum;
					
					
				}
				if(i%2!=0) {
					oddsum=i+evensum;
					
				}
				System.out.println("----------------");
				System.out.println("sum of even numbers" +evensum);
				System.out.println("sum of odd numbers" + oddsum);
				

	}
	}
}


