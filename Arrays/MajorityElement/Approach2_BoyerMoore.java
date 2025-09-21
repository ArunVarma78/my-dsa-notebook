// Approach2_BoyerMoore.java
// Boyer–Moore Voting Algorithm
// Time: O(n), Space: O(1)

class Solution {
    public int majorityElement(int[] nums) {
        int count = 1, majority = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (majority != nums[i]) {
                count--;
                if (count <= 0) {
                    majority = nums[i];
                    count = 1;
                }
            } else {
                count++;
            }
        }
        return majority;
    }
}
