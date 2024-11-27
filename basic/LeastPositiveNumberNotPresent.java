package basic;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeastPositiveNumberNotPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {-3,-1,0,3,1,2,7,6,5,4,10};
		
		int n =arr.length;
		
		Set<Integer> leastPositive = new HashSet<Integer>();
		
		for(int a: arr) {
			if(a > 0) {
				leastPositive.add(a);
				
			}
		}
		int flag=1;
		for(Integer i: leastPositive) {
			System.out.println(i);
			if(flag++ != i) {
				flag--;
				break;
			}
			
		}
		System.out.println(flag);

		
	}

}






