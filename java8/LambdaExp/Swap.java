package java8.LambdaExp;

public class Swap {

	public interface SwapNos{
		void swp(int a,int b);
	}

	public static void main(String[] args) {

		SwapNos swap = (a,b)->{
			int temp=0;
			temp = a;
			a = b;
			b = temp;
			System.out.println(a+" "+b);
		};
		swap.swp(4, 8);
	}

}
