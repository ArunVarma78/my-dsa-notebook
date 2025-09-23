# First Set Bit

- Problem: [GeeksforGeeks - First Set Bit](https://www.geeksforgeeks.org/problems/find-first-set-bit-1587115620/0)  
- Description: Given an integer `n`, return the position of the first set bit (1) from the **right side** in its binary representation.  
  If no set bit exists, return 0.

---

## Examples
- Input: `n = 18` → Binary = `10010` → Output: `2`  
- Input: `n = 12` → Binary = `1100` → Output: `3`  
- Input: `n = 1` → Binary = `1` → Output: `1`

---

## Constraints
- 1 ≤ n ≤ 10⁹

---

## Approaches

### 1. Division Check
- Repeatedly divide `n` by 2 while counting.
- If the remainder is 1, return current count.
- Time: O(log n), Space: O(1)

### 2. Bitwise AND
- Use a mask `i = 1, 2, 4, 8, ...` (powers of 2).
- Check `(n & i)`. If non-zero, that position is the first set bit.
- Time: O(log n), Space: O(1)
