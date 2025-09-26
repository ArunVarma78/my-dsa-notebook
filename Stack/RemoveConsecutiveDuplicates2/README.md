# Removing Consecutive Duplicates - 2

- Problem: [GeeksforGeeks](https://www.geeksforgeeks.org/problems/removing-consecutive-duplicates-2-1587115621/0)  
- Description: Given a string `s`, repeatedly remove adjacent **pairs of duplicate characters** until no such pair remains. Return the final string. If the string becomes empty, return `"Empty String"`.

---

## Examples
- Input: `s = "aaabbaaccd"` → Output: `"ad"`  
- Input: `s = "aaaa"` → Output: `"Empty String"`

---

## Approaches

1. **Approach1_Stack.java**  
   - Use a stack to remove adjacent pairs as you scan.  
   - Push if current char ≠ stack top, else pop.  
   - Time: O(n), Space: O(n)

2. **Approach2_TwoPointer.java**
   - Use a `StringBuilder` as a dynamic stack with two-pointer logic.  
   - Faster in practice (less object overhead).  
   - Time: O(n), Space: O(n)
