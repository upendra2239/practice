package core;

public class linearSearch {

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
		
		int index = -1;
		
		for(int j=0;j<intArray.length;j++) {
			if(intArray[j]==7) {
				index = j;
				break;
			}
		}
		System.out.println(index);
		
	}

}
