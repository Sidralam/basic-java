package com.syntax.class01;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day=3;

        if(day==1) {
            System.out.println("Monday");
        }else if(day==2) {
            System.out.println("Tuesday");
        }else if(day==3){
            System.out.println("Wednesday");
        }else if(day==3){
            System.out.println("Friday");
        }else if(day==3){
            System.out.println("Saturday");
        }else if(day==3){
            System.out.println("Sunday");
        }
        System.out.println("-----------------------------------");
        String name;
        switch(day) {
        case 1:
        	name = "Monday";
        	break;
        case 2:
        	name ="Tuesday";
        	break;
        case 3:
        	name ="Wednesday";
        	break;
        case 4:
        	name = "Thrusday";
        	break;
        case 5:
        	name ="Friday";
        	break;
        case 6:
        	name ="Saturday";
        	break;
        case 7:
        	name ="Sunday";
        	break;
        	default:
        		name= "Invalid";
        		break;
        		
        	
        }
        





    }



	}


