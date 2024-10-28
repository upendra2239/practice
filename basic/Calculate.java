package basic;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = a+b, sub = a-b, mul = a*b, div = a/b, mod = a%b;
		
		System.out.println("sum:"+sum);
		System.out.println("sub:"+sub);
		System.out.println("mul:"+mul);
		System.out.println("div:"+div);
		System.out.println("mod:"+mod);
		
		
	}

}
