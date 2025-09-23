# Three Way Partitioning

- Problem: [GeeksforGeeks - Three Way Partitioning](https://www.geeksforgeeks.org/problems/three-way-partitioning/0)  
- Description: Given an array and range `[a, b]`, rearrange elements so that:
  1. All elements smaller than `a` appear first.
  2. All elements in range `[a, b]` appear next.
  3. All elements greater than `b` appear last.  

The order of elements within each partition does not matter.  

**Challenge:** Solve in O(n) time and O(1) extra space.

---

## Approach

1. **Approach1_DutchNationalFlag.java**
   - Use three pointers: `low`, `mid`, `high`.
   - Swap elements to ensure:
     - If `< a`, swap to front.
     - If in `[a, b]`, keep in middle.
     - If `> b`, swap to back.
   - Time: O(n), Space: O(1)
