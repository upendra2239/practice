package basic;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int x=0;x<5;x++) {
			System.out.println(x);
		}
		//above x is terminated only till for loop exits.
		int x=0;
		{
			int j=1;
		}
		//below line will show error because j scope is only in { }
		//System.out.println(j);
		
		Object obj = new Object();
		System.out.println(obj.getClass());
	}
}
