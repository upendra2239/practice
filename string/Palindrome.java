package string;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="madame";
		char ch[]=s.toCharArray();
		String s1="";
		int i;
		for(i=ch.length-1;i>=0;i--) {
			s1+=ch[i];
		}
		if(s.equals(s1)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
