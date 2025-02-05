public class Day22 {
    public static void main(String[] args) {
        System.out.println("Day 22");
    }
}

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int st = 1;
            int end = n;
            while(st<end){
                int mid = st+(end-st)/2;
                if(isBadVersion(mid)){
                    end = mid;
                }
                else{
                    st = mid+1;
                }
            }
            return st;
        }
    }
    
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> arrlist = new ArrayList<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(nums[i]==target) arrlist.add(i);
        }
        return arrlist;
    }
}    

class Solution {
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

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                result[0] = mid; 
                right = mid-1; 
            }
            else if(nums[mid]<target){
                left = mid+1;
            }
            else if(nums[mid]>target){
                right = mid-1;
            }
        }
        int st = 0;
        int end = nums.length-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(nums[mid]==target){
                result[1] = mid;
                st = mid+1;
            }
            else if(nums[mid]<target){
                st = mid+1;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
        }
        return result;
    }
}
