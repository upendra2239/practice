package basic;

public class _Lex$ {
	
	public static int count = 0;
	
	public static void main(String[] args) {
		{int count =1;}
		{int count = 2;
		System.out.println(count);
		}
		
		String s = "Lex";
		String s1 = new String("Lex");
		
		System.out.println(s == s1);
		System.out.println(s.equals(s1));
		
		
	}
}

