
import java.util.HashMap;

class Solution2 {
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

    public class Solution1 {
        public int[] threeSum(int[] nums, int target) {
            int indexes[] = new int[3];
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[i] + nums[j] + nums[k] == target) {
                            indexes[0] = i;
                            indexes[1] = j;
                            indexes[2] = k;
                            return indexes;
                        }
                    }
                }
            }
            return indexes;
        }
    }
    
}

