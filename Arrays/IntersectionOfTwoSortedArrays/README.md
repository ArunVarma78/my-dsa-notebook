# Intersection of Two Sorted Arrays

- Problem: [GeeksforGeeks - Intersection of Two Sorted Arrays](https://www.geeksforgeeks.org/problems/intersection-of-two-sorted-array-1587115620/0)  
- Description: Given two sorted arrays, return the elements common to both arrays (intersection) without duplicates. If there is no intersection, return an empty list.

## Approaches

1. **Approach1_TwoPointers.java**
   - Uses two pointers to traverse both arrays.
   - Skips duplicates while collecting common elements.
   - Time: O(n + m), Space: O(1)

2. **Approach2_HashSet.java**
   - Stores elements of one array in a HashSet.
   - Checks common elements from the second array, removing duplicates.
   - Time: O(n + m), Space: O(n)
