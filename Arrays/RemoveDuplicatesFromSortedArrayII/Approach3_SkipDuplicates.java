// Approach3_SkipDuplicates.java
// Two-pointer skipping duplicates using neighbor check
// Time: O(n), Space: O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;
        int k = 1;
        for (int i = 1; i < n; i++) {
            if (i == n - 1 || nums[i - 1] != nums[i + 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
