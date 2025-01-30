class Solution9 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0;i<nums.length;i++){
            result^=nums[i];
        }
        return result;
    }
}

class Solution8 {
    public int singleNumber(int[] nums) {
        int once = 0;
        int twice = 0;
        for(int i = 0;i<nums.length;i++){
            twice |= once & nums[i];
            once ^= nums[i];
            int mask = ~(once & twice);
            once &= mask;
            twice &= mask; 
        }
        return once;
    }
}