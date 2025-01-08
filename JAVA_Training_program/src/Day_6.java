import java.util.*;
public class Day_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        sc.close();
        for (int i=0;i<n;i++) {
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
    
        int indexes[] = new int[2];
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    indexes[0] = i;
                    indexes[1] = j;
                    break;
                }
            }
        }
        return indexes;
    }
}


