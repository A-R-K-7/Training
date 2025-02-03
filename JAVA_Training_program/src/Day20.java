public class Day20{
    
}

class Solution11 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(nums[mid]>nums[right]){
                left=mid+1; 
            }
            else if(nums[mid]<nums[right]){
                right = mid;
            }
        }
        int pivotIndex = left;

        int st = 0;
        int end = nums.length-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            int realMid = (mid+pivotIndex)%nums.length;

            if(nums[realMid] == target){
                return realMid;
            }
            else if(nums[realMid]>target){
                end = mid-1;
            }
            else if(nums[realMid]<target){
                st = mid+1;
            }
        }
        return -1;
    }
}