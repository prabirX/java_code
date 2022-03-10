import java.util.*;
public class Books {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int t=sc.nextInt();
         int[] arr=new int[n];
         for(int j=0;j<n;j++){
           arr[j]=sc.nextInt();
         }
         System.out.println(n+ " "+t);
         System.out.print(search(arr,t));
   
        sc.close();
       }
   
   static int search(int [] arr,int t){
     int sum=0,count=0,ans=0;
     for(int i=0;i<arr.length;i++){
       if(sum<=t){
         sum=sum+arr[i];
         count++;
       }
       if(count>ans) ans=count;
     }
     return ans;
    }
}
