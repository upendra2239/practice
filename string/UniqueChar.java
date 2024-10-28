package string;

import java.util.ArrayList;

public class UniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "Get the future you want";
		int index = -1;
		char occ = ' ';
		//first occurrence of unique character
		
		  for(char i: s.toCharArray()) {
		  
		  if(s.indexOf(i)== s.lastIndexOf(i)) { 
			  occ = i; 
			  break; 
		  } 
		  else { 
			  index++; 
		  } 
		  }
		 	
		if(index == s.length()-1) {
			System.out.println("All are repeating");
		}
		else {
			System.out.println("first unique character is:"+occ);
		}
		
		//last occurance of unique character
		int i,n=s.length();
		int oc[]=new int[256];
		char ch=' ';
		for(i=0;i<n;i++) {
			oc[s.charAt(i)]++;
		}

		for(i=n-1;i>=0;i--) {
			ch=s.charAt(i);
			if(oc[ch]==1) {
				System.out.println("last unique occurance character is:"+ch);
				break;
			}
		}
		
		ArrayList<Character> al = new ArrayList<>();
		int c[]=new int[256];

		for(i=0;i<n;i++) {
			c[s.charAt(i)]++;
		}
		
		for(i=0;i<s.length();i++){

			ch = s.charAt(i);

			if(c[ch]==1){

			al.add(ch);

			}

		}
		System.out.println("first: "+al.get(0));
		System.out.println("second: "+al.get(1));
		System.out.println("All: "+al);

	}

}
