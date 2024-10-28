package string;

public class StringReverseSameSpaces {

	public static void main(String[] args) {

		String s = "This is a pen";
		char ch[] = s.toCharArray();
		char result[]= new char[s.length()];
		
		int i, j=result.length-1;
		for(i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				result[i]=' ';
			}
		}
		
		for(i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				if(result[j]==' ') {
					j--;
				}
				result[j]=ch[i];
				j--;
			}
		}
		System.out.println(String.valueOf(result));
	}

}
