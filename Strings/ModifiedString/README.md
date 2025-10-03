# Modified String

- Problem: [GeeksforGeeks - The Modified String](https://www.geeksforgeeks.org/problems/the-modified-string-1587115621/0)  
- Description: Given a string `s`, find the minimum number of characters to insert such that no three consecutive characters are the same.

---

## Approaches

1. **Approach1_RunLengthCounting.java**
   - Counts consecutive characters using run-length.
   - Handles groups larger than 2 by calculating required insertions.
   - Time: O(n), Space: O(1)

2. **Approach2_SimpleLinearScan.java**
   - Linear scan, increments insertion count when three consecutive chars are found.
   - Simpler and more direct.
   - Time: O(n), Space: O(1)
