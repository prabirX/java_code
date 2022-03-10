public class mountainAry {
    public static void main(String[] args) {
        int arr[]={2,3,5,6,7,8,10,11,12,15,23,30};
        int target=7;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int peak=peakIndex(arr);
        int first=binarySearch(arr,0,peak,target);
        if(first!=-1)
        return first;
        else
        return binarySearch(arr,peak,arr.length-1,target);
    }
    static int binarySearch(int[] arr,int start,int end,int target){
        boolean Isfirst=(arr[end]>arr[start]);
        while(start<=end){
            int mid=start+(end-start)/2;
            if(Isfirst){
            if(arr[mid]<target)
            start=mid+1;
            else if(arr[mid]>target)
            end=mid-1;
            else return mid;
            }
            else{
                if(arr[mid]<target)
                end=mid-1;
                else if(arr[mid]>target)
                start=mid+1;
                else
                return mid;
            }
        }
        return -1;
    }
    static int peakIndex(int[] arr){
        int start=0; int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1])
            start=mid+1;
            else if(arr[mid]>arr[mid+1])
            end=mid;
        }
        return start;
    }
}
