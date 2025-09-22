# Remove Common Characters and Concatenate

- Problem: [GeeksforGeeks - Remove Common Characters and Concatenate](https://www.geeksforgeeks.org/problems/remove-common-characters-and-concatenate-1587115621/0)
- Description: Given two strings `s1` and `s2`, remove all characters common to both strings and concatenate the remaining characters in their original order. Return "-1" if no characters remain.

## Approaches

1. **Approach1_HashSet.java**
   - Use two HashSets to store characters of each string  
   - Append characters not present in the other string to result  
   - Time: O(|s1| + |s2|), Space: O(|s1| + |s2|)
