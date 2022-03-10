import java.util.*;

public class FirstLastOccurance {
    public static void main(String[] args) {
        int nums[]={1,2,7,7,7,9,12,15};
        int target=7;
        int ans[]=searchRange(nums, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] searchRange(int[] nums, int target){
        int ans[]={-1,-1};
        ans[0]=search(nums,target,true);
        ans[1]=search(nums,target,false);
        return ans;

    }
    static int search(int nums[],int target,boolean firstOccurance){
        int answer=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid])
            end=mid-1;
            else if(target>nums[mid])
            start=mid+1;

            else{
                answer=mid;
                if(firstOccurance){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
                
            }
            

        }
        return answer;

    }
}
