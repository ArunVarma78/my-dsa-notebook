# Square Root

- Problem: [GeeksforGeeks - Square Root](https://www.geeksforgeeks.org/problems/square-root/0)  
- Description: Given a positive integer `n`, find its square root. If `n` is not a perfect square, return the floor value of its square root.

## Approaches

1. **Approach1_LinearSearch.java**
   - Start from `1`, increment until `i*i >= n`  
   - Return `i` if exact square, else `i-1`  
   - Time: O(√n), Space: O(1)

2. **Approach2_BinarySearch.java**
   - Apply binary search in range `[1, n]`  
   - Narrow down until closest integer square root is found  
   - Time: O(log n), Space: O(1)
