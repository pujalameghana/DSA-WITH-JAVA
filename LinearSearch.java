public class LinearSearch{
public static int LSearch(int[] arr,int key){
   for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
           return i;
}
}
return -1;
}
public static void main(String args[]){
   int[] arr={8,1,2,4,5,6,7,28,9};
int key=7;
int result=LSearch(arr,key);
if(result!=-1){
   System.out.print("key"+key+"found at index"+result);
}
else{
 System.out.println("not found");
}
}
}