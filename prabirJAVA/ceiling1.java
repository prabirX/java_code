import java.util.*;
public class ceiling1 {
    
  
        static Scanner sc=new Scanner(System.in);
        public static void main(String[] args){
       //  int[] arr={2,4,6,8,9,12,13,15,18,56,67};
               //   0 1 2 3 4 5   6 7  8  9  10 
        int arr[]={67,56,18,15,13,12,9,8,6,4,2} ;
         int target=7;
         System.out.print(bSearch(arr,target));
        }
        
       static int bSearch(int[] arr,int target){
           int start=0;
           int end=arr.length-1;
           int mid=0;
          boolean asc=(arr[0]-arr[arr.length-1]<0);
        
           while(start<=end){
    
                mid=start+(end-start)/2;
    
               if(arr[mid]==target)
               return mid;
            if(asc){
               if(arr[mid]<target)
               start=mid+1;
               else
               end=mid-1;
            }
           else{
               if(arr[mid]<target)
               end=mid-1;
               else
               start=mid+1;
           }
           }
        

           return arr[end];
       }
    }

