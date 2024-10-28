package string;

public class CapitalizeFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hello world this is java";
		
		char[] charArray = str.toCharArray();
		
		boolean foundSpace = true;
		
		for(int i=0; i<charArray.length;i++) {
			if(charArray[i] >='a' && charArray[i] <= 'z') {
				if(foundSpace) {
					charArray[i] = (char)(charArray[i]- 'a' +'A');
					foundSpace = false;
				}
			}else {
					foundSpace = true;
			}

		}
		System.out.println(new String(charArray));
	}

}
