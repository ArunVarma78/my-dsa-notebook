# Modular Inverse

- Problem: [GeeksforGeeks - Modular Inverse](https://www.geeksforgeeks.org/problems/modular-multiplicative-inverse-1587115620/0)  
- Description: Given two integers `n` and `m`, find the smallest modular multiplicative inverse of `n` under modulo `m`.  
  That is, find an integer `x` such that `(n * x) % m == 1`.  
  If no such number exists, return `-1`.

---

## Examples
- Input: n = 3, m = 11 → Output: 4  
  Explanation: (3 × 4) % 11 = 12 % 11 = 1  

- Input: n = 10, m = 17 → Output: 12  
  Explanation: (10 × 12) % 17 = 120 % 17 = 1  

---

## Constraints
- 1 ≤ n ≤ 10⁴  
- 1 ≤ m ≤ 10⁵  

---

## Approaches

### 1. Brute Force
- Try all numbers from `1` to `m-1` until `(a * i) % m == 1`.  
- Works for small constraints.  
- Time: **O(m)**, Space: **O(1)**  

### 2. Extended Euclidean Algorithm
- Uses the property: if `gcd(a, m) == 1`, then inverse exists.  
- Computes coefficients `x, y` in `ax + my = gcd(a, m)` → inverse = `x mod m`.  
- Efficient for large numbers.  
- Time: **O(log(min(a, m)))**, Space: **O(1)**  
