package java8.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(8);
		
		Consumer<List<Integer>> modify = lst ->{
			for(int i=0;i<lst.size();i++)
				lst.set(i, 2*lst.get(i));
		};
		
		Consumer<List<Integer>> display = lst->lst.forEach(i->System.out.println(i));
		
		modify.andThen(display).accept(list);
	}

}
