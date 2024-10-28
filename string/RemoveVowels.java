package string;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Get the future you want";
		String vowels = "aeiouAEIOU";
		
		String c="";
		for(int i=0;i<s.length();i++) {
			if(vowels.indexOf(s.charAt(i))==-1) {
				c += s.charAt(i);
			}
		}
		System.out.println(c);
		
		//count vowels and consonants
		int count=0;
		s = s.replaceAll(" ", "");
		int size = s.length();
		for(int i=0;i<s.length();i++) {
			if(vowels.indexOf(s.charAt(i))!=-1) {
				count++;
				
			}
		}
		System.out.println("vowels:"+count);
		int con = size - count;
		System.out.println("consonants:"+con);

	}

}
