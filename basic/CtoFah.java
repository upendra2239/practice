package basic;

import java.util.Scanner;

public class CtoFah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double f,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter temp in c:");
		c = sc.nextDouble();
		
		f = (c*9.0/5.0) + 32;
		
		System.out.println("Temp in F:"+f);
		
		System.out.println("enter temp in F:");
		f = sc.nextDouble();
		
		c = (f-32)*(5.0/9.0);
		System.out.println("Temp in c:"+c);

	}

}
