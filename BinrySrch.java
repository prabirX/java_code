import java.util.*;
public class BinrySrch {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
     int[] arr={2,4,6,7,8,9,12,56,67};
           //   0 1 2 3 4 5 6  7  8
     int target=12;
     System.out.print(bSearch(arr,target));
    }
    
   static int bSearch(int[] arr,int target){
       int start=0;
       int end=arr.length-1;
       int mid=0;
      
       while(start<=end){

            mid=start+(end-start)/2;

           if(arr[mid]==target)
           return mid;

           else if(arr[mid]<target)
           start=mid+1;
           else
           end=mid-1;
       }
       return -1;
   }


}
