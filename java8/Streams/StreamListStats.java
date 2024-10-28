package java8.Streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;

public class StreamListStats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1,7,4,9,8,3);
		
		long count = list.stream().count();
		System.out.println("count:"+count);
		
		int sum = list.stream().reduce(0, (x,y)->x+y);
		System.out.println("sum:"+sum);
		
		int max = list.stream().max(Integer::compare).get();
		System.out.println("max:"+max);
		
		double avg = list.stream().mapToInt(x->x).average().orElse(0);
		System.out.println("avg:"+avg);
		
		//can do all the above using summary statistics
		IntSummaryStatistics stats = list.stream()
				.mapToInt(Integer::intValue)
				.summaryStatistics();
		
		System.out.println("count:"+stats.getCount());
		System.out.println("sum:"+stats.getSum());
		System.out.println("max:"+stats.getMax());
		System.out.println("avg:"+stats.getAverage());
	}

}
