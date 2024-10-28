package string;

public class Panagram1 {

	public static void main(String[] args) {

		String s = "The quick brown fox jumps over the lazy dog";
		
		s.toLowerCase();
		
		boolean allPresent = true;
		
		for(char ch='a';ch<='z';ch++)
		{
			if(!s.contains(String.valueOf(ch)))
			{
				allPresent=false;
				break;
			}
		}
		
		if(allPresent) {
			System.out.println("Panagram");
		}
		else {
			System.out.println("Not Panagram");

		}
	}

}
