class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int length = nums.length;
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for(int i = 0;i<length;i++){
            int difference = target - nums[i];
            if(indexMap.containsKey(difference)){ 
                result[0] = indexMap.get(difference);
                result[1] = i;
                return result; 
            }
            indexMap.put(nums[i],i);
        }
        return result;
        
        
        
        // int indexes[] = new int[2];
        // for(int i = 0;i<length;i++){
        //     for(int j = i+1;j<length;j++){
        //         if(nums[i]+nums[j]==target){
        //             indexes[0] = i;
        //             indexes[1] = j;
        //             break;
        //         }
        //     }
        // }
        // return indexes;


    }
}

