# Union of Arrays with Duplicates

- Problem: [GeeksforGeeks - Union of Two Arrays](https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/0)
- Description: Given two arrays `a[]` and `b[]`, return the union of both arrays in **any order**. Duplicate elements are included only once.

---

## Approaches

1. **Approach1_HashSet.java**
   - Use a HashSet to store all elements from both arrays
   - Convert set to list and return
   - Time: O(n + m), Space: O(n + m)
