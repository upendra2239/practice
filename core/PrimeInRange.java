package core;

public class PrimeInRange {

	public static void main(String[] args) {

		int a = 10, b = 20;
		
		for(int i=a;i<=b;i++) {
			if(checkPrime(i)) {
				System.out.println(i);
			}
		}
}

	private static boolean checkPrime(int i) {
		
			if(i<2) {
				return false;
			}
			
			for(int j=2;j<=i/2;j++) {
				
				if(i%j == 0) {
					return false;					
				}

			}
			return true;
		}

	}

