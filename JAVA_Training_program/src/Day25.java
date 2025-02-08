class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int capacity = 0;
        while(left<right){
            int res = (Math.min(height[left],height[right]))*(right-left);
            if(res>capacity){
                capacity = res;
            }
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return capacity;
    }
}