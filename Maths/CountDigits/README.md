# Count Digits in a Number

- Problem: [GeeksforGeeks - Count Digits in a Number](https://www.geeksforgeeks.org/problems/count-total-digits-in-a-number/0)  
- Description: Given a number `n`, find the total number of digits in it.

---

## Examples
- Input: `n = 1` → Output: `1`  
- Input: `n = 99999` → Output: `5`

---

## Constraints
- 1 ≤ n ≤ 10⁹

---

## Approaches

1. **Approach1_Recursion.java**  
   - Recursively divide by 10 and count.  
   - Time: O(log n), Space: O(log n) (recursion stack)

2. **Approach2_Loop.java**  
   - Iteratively divide by 10 and increment counter.  
   - Time: O(log n), Space: O(1)

3. **Approach3_Logarithm.java**  
   - Use formula: `floor(log10(n)) + 1`.  
   - Time: O(1), Space: O(1)

4. **Approach4_StringConversion.java**
   - Convert number to string and get its length
   - Time: O(log n), Space: O(log n)
