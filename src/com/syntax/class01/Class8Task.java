package com.syntax.class01;

import java.util.Scanner;

public class Class8Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);


        System.out.println("What do you want to buy?");
        String item=input.nextLine();
        System.out.println("What is the price of the item?");
        double price=input.nextDouble();
        double money;
        double total =0;


        do {
            System.out.println("How much money do you have?");
            money=input.nextDouble();
            
            double need;
            double change;
            
            if(total<price) {
            	need=price-total;
                System.out.println("You need to pay more $" + need);
                
            }else if(total>price) {
            	change=total-price;
                System.out.println("hee is your change" + change);
                break;
                
            }
        }while(total != money);
        System.out.println("Thank you for shopping!");

	}

}
