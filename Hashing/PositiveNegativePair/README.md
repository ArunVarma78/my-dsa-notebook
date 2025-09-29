# Positive Negative Pair

- Problem: [GeeksforGeeks - Positive Negative Pair](https://www.geeksforgeeks.org/problems/positive-negative-pair5209/0)  
- Description: Given an array of distinct integers, find all pairs such that both positive and negative values exist.  
  Pairs should appear in the order where the **second element of the pair appears first** in the array.  
  Each pair should be returned as `[negative, positive]`.  

---

## Approaches

1. **Approach1_HashSet.java**
   - Use a set to track visited numbers.
   - If `-x` exists, add pair `[-x, x]` (with correct order).
   - Time: O(n), Space: O(n)
