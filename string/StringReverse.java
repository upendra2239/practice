package string;


  public class StringReverse {
  
  public static void main(String[] args) { // TODO Auto-generated method stub
  
  String s = "Get the future you want"; 
  char[] p = s.toCharArray();
  
  System.out.println(p);
  
  String rs = "";
  
  for(int i=p.length-1;i>=0;i--) { 
	  rs +=p[i]; 
  }
  
  System.out.println(rs); 
  
 

//Java program to ReverseString using StringBuilder

//Class of ReverseString

		String input = "Geeks for Geeks";

		StringBuilder input1 = new StringBuilder();

		input1.append(input);

		input1.reverse();
		
		
		System.out.println(input1);
	}
}
