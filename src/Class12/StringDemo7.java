package Class12;

public class StringDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="I am always confused i was kidding";
		
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("s"));
		System.out.println(str.indexOf(" "));
		
		//substring() gives you smaller string 
		//from a string we can start the starting
		//part of this method it will return us
		//the substring from that index
		
		System.out.println(str.substring(5));
		System.out.println(str.substring(5,11));
		
		
	

	}

}
