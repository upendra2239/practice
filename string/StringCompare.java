package string;

public class StringCompare {

	public static void main(String[] args) {


		String s1 = new String("Get the future you want");
		String s2 = "Get the future you want";
		
		// equals compares content or value of string
		if(s1.equals(s2)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		// == compares memory location
		if(s1 == s2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
