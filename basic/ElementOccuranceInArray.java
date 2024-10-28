import java.util.*;

public class ElementOccuranceInArray{
int arr[] = {1,3,7,11,67,200,89,45,101,1,3,56,67};

  Map<Integer, Integer> count = new HashMap<>();
  for(int n:arr){
  count.merge(n, 1, Integer::sum);
}
System.out.println(count);
}
