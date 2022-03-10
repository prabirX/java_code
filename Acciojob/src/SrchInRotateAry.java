public class SrchInRotateAry {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7,0,1,2};
        int target=4;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int pvt=pivot(arr); System.out.println("pivot=" +pvt);
        int ans=-1;
       
        ans=BnrySearch(arr,0,pvt,target);
        if(ans!=-1) return ans;
        else
        ans=BnrySearch(arr,pvt+1,arr.length-1,target);
        return ans;

        
    }
    static int pivot(int[] arr){
        int start=0; int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            //4 cases will be here
            if(mid<end && arr[mid]>arr[mid+1])  //if pivot is the last element then,this conditn fails it will return -1;
            return  mid;
            if(mid>start && arr[mid]<arr[mid-1]) //same
            return mid-1;
            if(arr[start]>=arr[mid])
            end=mid-1;
            else
            start=mid+1; // if that element is the pivot then it will be catch in the first two condition.
        }
       
        return -1;
    }
    static int BnrySearch(int[] arr,int start,int end,int target){
        
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(arr[mid]<target)
            start=mid+1;
            else if(arr[mid]>target)
            end=mid-1;
            else return mid;
            
           
            }
        
        return -1;
    }
    
}

/*
import java.util.*;
import java.io.*;

public class Main {
  public static int binary(int a[], int l, int r, int k){
      while(l <= r){
        int mid = (l + r) / 2;
        if(a[mid] == k){
          return mid;
        }
        if(a[mid] < k){
          l = mid + 1;
        }else{
          r = mid - 1;
        }
      }
    return -1;
  }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int k = input.nextInt();
      int a[] = new int[n];
      for(int i= 0; i < n;i ++){
        a[i] =input.nextInt();

      }
      int l = 0, r = n - 1;
      int ans = -1;
      while(l <= r){
        int mid = (l + r) / 2;
        if(a[mid] >= a[0]){
          ans = mid;
          l = mid + 1;
        }else{
          r = mid - 1;
        }
      }
      if(k >= a[0]){
        System.out.println(binary(a, 0, ans, k));
      }else{
        System.out.println(binary(a, ans + 1, n - 1, k));
        }
    }
}
*/