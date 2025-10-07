# Anagram

- Problem: [GeeksforGeeks - Anagram](https://www.geeksforgeeks.org/problems/anagram-1587115620/0)  
- Description: Given two strings `s1` and `s2`, check if they are anagrams of each other.  
  Two strings are anagrams if they contain the same characters with the same frequencies, regardless of order.

---

## Approaches

1. **Approach1_Sorting.java**
   - Convert strings to character arrays, sort them, and compare.
   - Time: O(n log n), Space: O(n)

2. **Approach2_FrequencyArray.java**
   - Use a frequency array of size 26 (for lowercase letters).
   - Increment for characters in `s1`, decrement for characters in `s2`.
   - If all frequencies balance out, they are anagrams.
   - Time: O(n), Space: O(1)
