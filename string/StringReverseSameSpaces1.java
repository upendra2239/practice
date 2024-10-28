package string;

public class StringReverseSameSpaces1 {

	public static void main(String[] args) {

		String s = "I am Java Developer";
		
		char c[] = s.toCharArray();
		
		char result[] = new char[s.length()];
		
		int i, j= result.length-1;
		
		for(i=0;i<c.length;i++) {
			if(c[i]== ' ') {
				result[i] = c[i];
			}
		}
		
		for(i=0;i<c.length;i++) {
			if(c[i]!=' ') {
			if(result[j]==' ') {
				j--;
			}
			result[j] = c[i];
			j--;
			}
		}
		System.out.println(String.valueOf(result));

	}

}
