package basic;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeastPositiveNumberNotPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {-3,-1,0,3,1,2,7,6,5,4,10};
		
		int n =arr.length;

		Arrays.sort(arr);
		int missing = 1;

		for(int m: arr){
			if(m == missing) missing++;
		}
		System.out.println(missing);
		
	}

}






