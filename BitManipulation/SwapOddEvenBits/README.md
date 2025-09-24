# Swap Odd and Even Bits

- Problem: [GeeksforGeeks - Swap Odd and Even Bits](https://www.geeksforgeeks.org/problems/swap-all-odd-and-even-bits-1587115621/0)  
- Description: Given an integer `n`, swap all **even-position bits** with their adjacent **odd-position bits**.

---

## Examples
- Input: `n = 23` → Output: `43`  
  Explanation: `23 = 00010111 (bin)` → after swapping → `00101011 (bin) = 43`.

- Input: `n = 2` → Output: `1`  
  Explanation: `2 = 10 (bin)` → after swapping → `01 (bin) = 1`.

---

## Constraints
- 1 ≤ n ≤ 10⁹  

---

## Approaches

### 1. String Simulation
- Convert to binary string, pad, swap characters in pairs, convert back.  
- Very inefficient but good for understanding.  
- Time: **O(log n)** (string ops), Space: **O(log n)**  

### 2. Bitwise Swap (per bit)
- Check each pair of bits, swap if different using XOR.  
- Time: **O(32)**, Space: **O(1)**  

### 3. Masking & Shifting (Optimal)
- Use masks:  
  - Even mask = `0xAAAAAAAA`  
  - Odd mask = `0x55555555`  
- Extract even/odd bits, shift, then combine.  
- Time: **O(1)**, Space: **O(1)**  
