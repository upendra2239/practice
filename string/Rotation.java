package string;

import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("String 1:");
		String s1 = sc.nextLine();
		s1 = s1.toLowerCase();
		
		System.out.println("String 2:");
		String s2 = sc.nextLine();
		s2 = s2.toLowerCase();
		
		boolean flag = false;
		for(int i=1; i<s1.length(); i++) {
			String s3 = s1.substring(i,s1.length())+s1.substring(0,i);
			System.out.println(s3);

			if(s3.equalsIgnoreCase(s2)) {
				flag= true;
				break;
			}
			
		}
		if(flag) {
			System.out.println("true");
		}
		else {
			System.out.println("false");

		}
		
	}

}
