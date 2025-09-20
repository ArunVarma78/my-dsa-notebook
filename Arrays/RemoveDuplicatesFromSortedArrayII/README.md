# Remove Duplicates from Sorted Array II

- Problem: [LeetCode 80](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
- Description: Given a sorted array nums, remove duplicates in-place such that each element appears at most twice and return the new length.

## Approaches

1. **Approach1_Flag.java**
   - Uses a boolean flag to track duplicates
   - Moves elements in-place
   - Time: O(n), Space: O(1)

2. **Approach2_IndexCheck.java**
   - Uses index check: `k < 2 || nums[i] != nums[k-2]`
   - Elegant two-pointer approach
   - Time: O(n), Space: O(1)

3. **Approach3_SkipDuplicates.java**
   - Checks neighbors: `i-1 != i+1` to skip duplicates
   - Another variation of two-pointer technique
   - Time: O(n), Space: O(1)
