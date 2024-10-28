package string;

public class PrintStringStartsWithSpecificLetter {

	public static void main(String[] args) {

		String s[]= {"apple","sample", "search","cat"};
		char ch='s';
		
		for(String str:s) {
			char c[]= str.toCharArray();
			if(c[0]==ch) {
				System.out.println(str);
			}
		}
		
		for(String str1: s) {
			if(str1.startsWith(String.valueOf(ch))) {
				System.out.println(str1);
			}
		}
	}

}
