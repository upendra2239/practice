package string;

public class WeightOfString {

	public static void main(String[] args) {

	String s = "Apple";
	
	boolean withVowels = true;
	
	
	  int weight=0; s = s.toLowerCase();
	  
	  if(withVowels) {
	  
	  for(int i=0;i<s.length();i++) { 
		  char letter = s.charAt(i);
	  
	  if(letter >= 97 && letter <= 122) { 
		  // Since 'a' has the weight of 1, 'b' has the weight of 2, and so on, 
		  //this calculation converts the character to its alphabetical position. 
		  weight += letter - 96; } 
	  } 
	  } else { 
		  for(int i=0;i<s.length();i++) { 
			  char letter = s.charAt(i);
	  
			  if(letter >= 97 && letter <= 122) { 
				  if(letter=='a'|| letter=='e' ||letter=='i' || letter=='o' || letter=='u') { 
					  continue; 
			  } else { 
				  weight += letter - 96; } } } } 
	  System.out.println(weight);
	 
	
	/*
	 * int weight = 0; s = s.toLowerCase();
	 * 
	 * if(withVowels) {
	 * 
	 * for(int i=0;i<s.length();i++) { char letter = s.charAt(i);
	 * 
	 * if(letter>=97 && letter <=122) { weight += letter - 96; } } }else { for(int
	 * i=0;i<s.length();i++) { char letter = s.charAt(i);
	 * 
	 * if(letter>=97 && letter <=122) { if(letter== 'a' || letter == 'e' || letter
	 * == 'i' || letter=='o' || letter=='u') { continue; }else { weight += letter -
	 * 96; } } } } System.out.println(weight);
	 */
		
	
	}

}
