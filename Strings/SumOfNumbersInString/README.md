# Sum of Numbers in String

- Problem: [GeeksforGeeks - Sum of numbers in string](https://www.geeksforgeeks.org/problems/sum-of-numbers-in-string-1587115621/0)  
- Description: Given a string `s` containing alphanumeric characters, calculate the sum of all the numbers present in the string.

---

## Approaches

1. **Approach1_IterativeDigitAccumulation.java**
   - Traverse each character.
   - Build numbers digit by digit.
   - Add the number to sum when a non-digit is found.
   - Time: O(|s|), Space: O(1)

2. **Approach2_RegexSplit.java**
   - Split the string on non-digit characters using regex.
   - Convert each numeric substring into an integer and sum them.
   - Time: O(|s|), Space: O(|s|)
