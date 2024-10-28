public class ArraySortCheck{
public static void main(String[] args){
int arr[] = {1,2,3,4,5,6,7,8,9};

boolean isAscending = true, isDescending = true;

for(int i=1;i<arr.length;i++){
if(arr[i]<arr[i-1])
  isAscending = false;
if(arr[i]>arr[i-1])
  isDescending = false;
}

if(isAscending || isDescending){
 System.out.println("Sorted");
}else{
System.out.println("not sorted");

}
}
