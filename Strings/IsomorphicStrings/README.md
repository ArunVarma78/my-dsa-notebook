# Isomorphic Strings

- Problem: [GeeksforGeeks - Isomorphic Strings](https://www.geeksforgeeks.org/problems/isomorphic-strings-1587115620/0)  
- Description: Check if two strings are isomorphic.  
  A mapping must be consistent:  
  - Each character in `s1` maps to exactly one character in `s2`.  
  - No two characters in `s1` can map to the same character in `s2`.

---

## Approaches

1. **Approach1_HashMapAndSet.java**
   - Uses a HashMap for character mapping and a HashSet to track already mapped values.
   - Time: O(n), Space: O(26)

2. **Approach2_TwoArrays.java**
   - Uses two arrays of size 256 (ASCII) for direct mapping between characters.
   - Faster than HashMap.
   - Time: O(n), Space: O(1)
