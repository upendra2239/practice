package basic;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = new int[7];
		
		intArray[0]=20;
		intArray[1]=35;
		intArray[2]=-15;
		intArray[3]=7;
		intArray[4]=55;
		intArray[5]=1;
		intArray[6]=-22;
		
		for(int j=0;j<intArray.length;j++) {
			System.out.println(intArray[j]);
		}
		for(int i:intArray) {
			System.out.println(i);
		}
		
		int n = intArray.length;
		int k = 0;
		while(k<n) {
			System.out.println(intArray[k]);
			k++;
		}
		System.out.println("to string");
		System.out.println(Arrays.toString(intArray));
		
		int[][] matrix = {{1,2,3}, {3,4,5}};
		System.out.println("deep to string");
		System.out.println(Arrays.toString(matrix));

		System.out.println(Arrays.deepToString(matrix));
	}

}
