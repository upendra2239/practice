package core;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {4,7,9,2,6,8};
		Arrays.sort(arr);
		
		int x=6,l=0,m,h=arr.length-1;
		
		while(l<=h) {
			m=l+(h-l)/2;
			
			if(arr[m] == x) {
				System.out.println("element found");
				break;
			}
			
			if(arr[m]<x) {
				l = m+1;
				
			}
			
			else {
				h = m-1;
			}
			if(l>h) {
				System.out.println("not found");
			}
		}
		
		
		
	}

}
