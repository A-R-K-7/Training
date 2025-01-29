
import java.util.HashMap;
import java.util.HashSet;

//[7,10,14,19,20]

// floor of 15 is 14

public class Day15{
    
}

class Solution4 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0;i<nums.length;i++){            
            if(hs.contains(nums[i])){
                return true;
            }
            hs.add(nums[i]);
        }
        return false;
    }
}

class Solution5 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(hm.containsKey(nums[i]) && i - hm.get(nums[i])<=k){
                return true;
            }
            hm.put(nums[i],i);
        }
        return false;
    }
}
