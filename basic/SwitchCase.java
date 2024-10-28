package basic;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a:");
		int a = sc.nextInt();
		
		System.out.println("Enter b:");
		int b = sc.nextInt();
		
		System.out.println("Enter operation:");
		System.out.println("1.sum");
		System.out.println("2.sub");
		System.out.println("3.mul");
		System.out.println("4.div");
		System.out.println("5.mod");
		
		int key = sc.nextInt();
		
		switch (key) {
		case 1: {
			result = a+b;
			System.out.println("sum:"+result);
			break;
		}
		case 2: {
			result = a-b;
			System.out.println("sub:"+result);
			break;
		}
		case 3: {
			result = a*b;
			System.out.println("mul:"+result);
			break;
		}
		case 4: {
			result = a/b;
			System.out.println("div:"+result);
			break;
		}
		case 5: {
			result = a%b;
			System.out.println("mod:"+result);
			break;
		}
		
		default:
			System.out.println("Enter valid operator!!");
		}
		
		
		System.out.println("Switch case using Java 8");
		
		result = switch(key) {
		case 1 -> a+b;
		case 2 -> a-b;
		case 3 -> a*b;
		case 4 -> a/b;
		case 5 -> a%b;
		default -> 0;
		};
		
		System.out.println("result:"+result);
	}

}
