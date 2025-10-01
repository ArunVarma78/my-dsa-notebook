# Repeating Character (First Leftmost)

- Problem: [GeeksforGeeks](https://www.geeksforgeeks.org/problems/repeating-character-first-appearance-leftmost/0)
- Description: Find the index of the first character that repeats in the string. If no character repeats, return -1.

## Approaches

1. **Approach1_HashSet.java**
   - Traverse from right → left.
   - Store characters in a `HashSet`.
   - First time we see a duplicate, store index as candidate.
   - Time: O(n), Space: O(1).

2. **Approach2_FrequencyArray.java**
   - Use an integer frequency array (ASCII size).
   - Traverse from right → left, check if already seen.
   - Time: O(n), Space: O(1).