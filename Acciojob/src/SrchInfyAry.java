
public class SrchInfyAry {
    public static void main(String[] args) {
        int arr[]={2,3,5,6,7,8,10,11,12,15,23,30};
        int target=15;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int start=0; int end=1;
        while(arr[end]<target){
              int newstart=end+1;
              end=end+(end-start+1);
              start=newstart;
        }
        return binrySrch(arr,start,end,target);

    }
    static int binrySrch(int[] arr,int start,int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target)
            end=mid-1;
            else if(arr[mid]<target){
                start=mid+1;
            }
            else return mid;
        }
        return -1;
    }
}
