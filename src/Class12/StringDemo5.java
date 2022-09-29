package Class12;

public class StringDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="I love programming";
		//CharAt returns us the characters at specific index
		System.out.println(str.charAt(2));
		
		for(int i=0; i<str.length(); i++) {
		//Print only the characters not the spaces
			if(!(str.charAt(i)==' ')) {
				System.out.println(str.charAt(i));
				
			}
			
		}
		

	}

}
