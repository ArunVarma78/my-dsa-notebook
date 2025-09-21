# Merge Sorted Array

- Problem: [LeetCode 88](https://leetcode.com/problems/merge-sorted-array/)
- Description: You are given two integer arrays `nums1` and `nums2`, sorted in non-decreasing order, and two integers `m` and `n`, representing the number of elements in `nums1` and `nums2` respectively. Merge `nums2` into `nums1` as one sorted array in-place.

## Approaches

1. **Approach1_TwoPointersFromEnd.java**
   - Use three pointers:  
     - `i` → end of `nums1` actual elements  
     - `j` → end of `nums2`  
     - `k` → end of merged array (`nums1`)  
   - Fill from the back to avoid overwriting elements
   - Time: O(m+n), Space: O(1)
