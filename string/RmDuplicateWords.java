package string;

public class RmDuplicateWords {

	public static void main(String[] args) {

		String s = "greet the day user greet good day";
		String s1="";
		String words[] = s.split(" ");
		
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					words[j] = "remove";
				}
			}
		}
		for(String word: words) {
			if(!word.equals("remove")) {
				s1 = s1 + word + " ";
			}
		}
		System.out.println(s1);
		
	}

}
