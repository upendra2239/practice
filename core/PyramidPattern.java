package core;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows=5, k=0;
		
		for(int i = 1; i <= rows; ++i,k=0) {
			for(int space = 1; space <=rows-i;++space) {
				System.out.print(" ");
			}
			
			while(k!=2*i-1) {
				System.out.print("*");
				++k;
			}
			System.out.println();
		}
		
		System.out.println();
		
		int number = 1;
		for(int i = 1; i <= rows; i++) {

		      for(int j = 1; j <= i; j++) {
		        System.out.print(number + " ");
		        ++number;
		      }

		      System.out.println();
		    }
	}

}
