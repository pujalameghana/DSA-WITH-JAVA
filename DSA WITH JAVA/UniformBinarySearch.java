import java.util.*;
class UniformBinarySearch{
  public static int Usearch(int[] arr,int target){
      int low=0;
      int high=arr.length-1;
      int[] offsets={5,2,1,0};
      for(int Offsets:offsets){
       int mid=low+Offsets;
       if(mid>high)
         mid=high;
       if(arr[mid]==target)
           return mid;
       if(arr[mid]<target)
          low=mid+1;
       else
          high=mid-1;;
}
return -1;
}
public static void main(String [] args){
 Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int target=sc.nextInt();
int result=Usearch(arr,target);
if(result!=-1){
System.out.println(target +"found at index"+ result);
}
else{
System.out.println(target+"not found");
}
}
}