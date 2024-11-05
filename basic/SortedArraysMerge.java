import java.util.*;
class SortedArraysMerge {
  public static void main(String[] args){
  int arr1[] = new int[]{1,2,3,4,5,6,7,9};
  int arr2[] = new int[]{3,4,5,6,7,9,10,11};
  int n1 = arr1.length, n2 = arr2.length;
  int merged[] = new int[n1 + n2];

  int i=0, j=0, k=0;

  while(i<n1 && j < n2) {
    if(arr1[i] <= arr2[j]){
     merged[k++] = arr1[i++];
    }else{
      merged[k++] = arr2[j++];
    }
  }
    while(i < n1){
      merged[k++] = arr1[i++];
    }
     while(j < n2){
      merged[k++] = arr2[j++];
    }

    for(int n: merged)
      system.out.println(n);

  }
}
