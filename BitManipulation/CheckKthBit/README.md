# Check K-th Bit

- Problem: [GeeksforGeeks - Check K-th Bit](https://www.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/0)  
- Description: Given two positive integers `n` and `k`, check if the `k`-th bit (0-indexed from the LSB) of `n` is set (1) or not.

---

## Examples
- Input: `n = 4, k = 0` → Binary = `100` → 0th bit = 0 → Output: false  
- Input: `n = 4, k = 2` → Binary = `100` → 2nd bit = 1 → Output: true  
- Input: `n = 500, k = 3` → Binary = `111110100` → 3rd bit = 0 → Output: false  

---

## Constraints
- 1 ≤ n ≤ 10⁹  
- 0 ≤ k ≤ 31  

---

## Approaches

### 1. Right Shift & Mask
- Right shift `n` by `k` bits and check the least significant bit.
- `(n >> k) & 1 == 1` means the k-th bit is set.
- Time: O(1), Space: O(1)

### 2. Bitwise AND with Mask
- Use `(n & (1 << k)) != 0` to directly check if k-th bit is set.
- Time: O(1), Space: O(1)
