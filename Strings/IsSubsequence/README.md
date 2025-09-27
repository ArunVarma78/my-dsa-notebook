# Is Subsequence

- Problem: [GeeksforGeeks - Check if a String is Subsequence of Other](https://www.geeksforgeeks.org/problems/given-two-strings-find-if-first-string-is-a-subsequence-of-second/0)  
- Description: Given two strings `s1` and `s2`, check if `s1` is a subsequence of `s2`.

---

## Approaches

1. **Approach1_TwoPointers.java**
   - Uses two pointers, advancing through both strings.
   - Time: O(|s2|), Space: O(1)

2. **Approach2_Recursion.java**
   - Recursive check by comparing last characters.
   - Time: O(|s1| + |s2|), Space: O(|s1| + |s2|)

3. **Approach3_IndexOfLoop.java**
   - Iteratively uses `String.indexOf` to find each character of `s1` in `s2`.
   - Time: O(|s1| * |s2|) worst case, Space: O(1)
