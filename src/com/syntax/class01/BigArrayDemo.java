package com.syntax.class01;

public class BigArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] bigArr=new String[2][4];
        //1 row
        bigArr[0][0]="Mr.";
        bigArr[0][1]="Mrs.";
        bigArr[0][2]="Miss.";
        bigArr[0][3]="Ms.";
        //2 row
        bigArr[1][0]="Smith";
        bigArr[1][1]="Jordan";
        bigArr[1][2]="Jackson";
        bigArr[1][3]="Obama";
        System.out.println(bigArr[0][1]+" "+bigArr[1][0]+","+bigArr[0][0]+" "+bigArr[1][3]+","+bigArr[0][3]+" "+bigArr[1][2]+","+bigArr[0][2]+" "+bigArr[1][1]+".");

	}

}
