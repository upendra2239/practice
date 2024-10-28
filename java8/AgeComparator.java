package java8;

import java.util.Comparator;

public class AgeComparator implements Comparator<ComparatorObjs>{

	public int compare(ComparatorObjs s1,ComparatorObjs s2){  
		/*
		 * if(s1.getAge()==s2.getAge()) return 0; else if(s1.getAge()>s2.getAge())
		 * return 1; else return -1;
		 */ 
		return ((Integer)s2.getAge()).compareTo((Integer)s1.getAge());
		}  
}
