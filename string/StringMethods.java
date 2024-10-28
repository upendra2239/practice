package string;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = " Get the future you want ";
		
		//length of string
		System.out.println(s.length());
		
		//split(delimiter(like @,'.), limit)
		String[] s1;
		s1=s.split(" ",5);
		
		for(String a: s1) {
			System.out.println(a);
		}
		
		//trim - removes whitespaces at start and end
		String s2 = s.trim();
		System.out.println(s2.length());
		
		//concat
		String s3 = "Capgemini -"+s;
		System.out.println(s3);
		
		//remove whitespaces
		String s4= s.replaceAll(" ", "");
		System.out.println(s4);
	}

}
