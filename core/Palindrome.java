package core;

import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]) {
		
		int n,x,rev=0,rem=0;
		Scanner sc = new Scanner(System.in);
		
	    n= sc.nextInt();
	    x =n;
	    
	    while(x>0) {
	    	rem=x%10;
	    	rev =(rev*10) + rem;
	    	
	    	x=x/10;
	    }
	    System.out.println(rev);
	    if(n==rev) {
	    	System.out.println("palindrome");
	    }
	}
}
