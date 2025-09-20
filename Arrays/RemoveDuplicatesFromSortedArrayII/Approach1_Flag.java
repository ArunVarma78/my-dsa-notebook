// Approach1_Flag.java
// Two-pointer with boolean flag
// Time: O(n), Space: O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 0;
        boolean repeated = false;

        for(int i = 1; i < nums.length; i++){
            if(nums[idx] != nums[i]){
                nums[++idx] = nums[i];
                repeated = false;
            } else if(!repeated){
                nums[++idx] = nums[i];
                repeated = true;
            }
        }

        return idx + 1;
    }
}
