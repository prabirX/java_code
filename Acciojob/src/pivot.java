public class pivot {
    public static void main(String[] args) {
        {
            int arr[]={1,2,3,4,5};
            System.out.println(findpivot(arr));
        }
    }
   static int findpivot(int[] arr){
       int start=0; 
       int end=arr.length-1;
       if(arr[0]<arr[arr.length-1]){
           return arr[0];
       }
       while(start<end){
           int mid=start + (end-start)/2;
           if(mid<end && arr[mid]>arr[mid+1]){
               return mid;
           }
           if(mid>start && arr[mid]<arr[mid-1]){
               return mid-1;
           }

           if(arr[mid]<arr[start]){
               end=mid-1;
           }
           else{
               start=mid+1;
           }
       }
       return -1;
   }

}
