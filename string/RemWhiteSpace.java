package string;

public class RemWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Get the future you want";
		
		s = s.replaceAll(" ", "");
		
		System.out.println(s);
		
		String str = "Get the future you want";

		StringBuilder result = new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(!Character.isWhitespace(ch)) {
				result.append(ch);
		
			}
		}
		System.out.println(result);
		
		StringBuilder result1 = new StringBuilder();

		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch!= ' ') {
				result1.append(ch); 
			}
		}
		System.out.println(result1);

	}

}
