package java8;

import java.util.Comparator;

public class NameComparator implements Comparator<ComparatorObjs>{

	@Override
	public int compare(ComparatorObjs o1, ComparatorObjs o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
