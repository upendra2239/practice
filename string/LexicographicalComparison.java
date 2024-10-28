package string;

public class LexicographicalComparison {

	public static void main(String[] args) {

		String s1 = "app";
		String s2 = "apple";
		
		
		int n = Math.min(s1.length(), s2.length());
		
		int result = 0;
		for(int i=0; i<n; i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				result = s1.charAt(i) - s2.charAt(i);
				break;
			}
			result = s1.length() - s2.length();
		}
		if(result<0)
			System.out.println(s1+" is smaller than "+s2);			
		else if(result>0)
			System.out.println(s1+" is greater than "+s2);
		else
			System.out.println(s1+" is equal to "+s2);

		
		
	}

}
