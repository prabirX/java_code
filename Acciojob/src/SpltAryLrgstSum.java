public class SpltAryLrgstSum {
         public static void main(String[] args) {
             int arr[]={1,2,3,4,5,6,7,8,9,10};
             int m=5;
             System.out.println(split(arr,m));
         }
      //first find the minimun answer if the array has the minimum split i.e 1 and the maximum split arr.length   
         static int split(int[] arr,int m){
              int min=0; int max=0;
              for(int i=0;i<arr.length;i++){
                  min=Math.max(min,arr[i]);  // max element in the array
                  max+=arr[i];  //sum of the array , if the array has just only one split
              }
      //take  min as start and the max as end.and then make the search for min sum
  int start=min; int end=max;  //just for the name sake to implement the binary search 
            while(start<end){
               
                int mid=start+(end-start)/2;    // we have to find the minimum max value for which the array split into "m" pieces
               //System.out.println(start+" "+end+" "+mid);
               int pieces=1; 
               int sum=0;
                for(int x:arr){
                    if(sum+x>mid){
                         sum=x;
                         pieces++;
                    }
                    else
                    sum=sum+x;
                }
                if(pieces>m)
                 start=mid+1;    //need sum as bigger number, to minimize the array split<=m
                 else
                end=mid; 
            }
              return start;
         }
        
}
