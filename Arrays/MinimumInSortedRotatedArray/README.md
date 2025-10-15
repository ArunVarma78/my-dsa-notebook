# Minimum Number in a Sorted Rotated Array

- Problem: [GeeksforGeeks - Minimum Number in a Sorted Rotated Array](https://www.geeksforgeeks.org/problems/minimum-number-in-a-sorted-rotated-array-1587115620/0)  
- Description: Given a sorted array that has been rotated at some unknown point, find the minimum element.

## Approaches

1. **Approach1_LinearScan.java**
   - Scans all elements to find the minimum.
   - Time: O(n), Space: O(1)

2. **Approach2_BinarySearchVariant1.java**
   - Uses binary search comparing mid and high.
   - Time: O(log n), Space: O(1)

3. **Approach3_BinarySearchOptimal.java**
   - Optimized binary search that exits early when array is already sorted.
   - Time: O(log n), Space: O(1)
