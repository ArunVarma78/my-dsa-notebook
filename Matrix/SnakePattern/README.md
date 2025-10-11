# 🐍 Print Matrix in Snake Pattern

**Problem:** [GeeksforGeeks - Print Matrix in Snake Pattern](https://www.geeksforgeeks.org/problems/print-matrix-in-snake-pattern-1587115621/0)  
**Difficulty:** Easy  
**Category:** Matrix Traversal

---

## 🧩 Problem Statement

Given a square matrix `mat[][]` of size `n x n`, print the elements of the matrix in a *snake-like pattern*:
- The first row is printed left to right.
- The next row is printed right to left.
- This alternates for every row.

---

## ✨ Example

**Input:**  
`n = 3`  
`mat = [[45, 48, 54], [21, 89, 87], [70, 78, 15]]`

**Output:**  
`[45, 48, 54, 87, 89, 21, 70, 78, 15]`

---

## 💡 Approaches

### Approach 1: Directional Traversal
- Track traversal direction using a `j` pointer.
- Alternate direction after every row.

### Approach 2: Parity-Based Traversal ✅ *(Cleaner & simpler)*
- Even rows → left to right.
- Odd rows → right to left.
- Avoids extra direction variable.

---

## 🕒 Complexity
| Approach | Time | Space | Notes |
|-----------|------|-------|-------|
| 1 | O(N²) | O(1) | Direction tracking |
| 2 | O(N²) | O(1) | Simpler and preferred |

---

## 🧠 Edge Cases
- `n = 1` → single element only.
- Large matrix (`n = 1000`) → still fine (O(N²)).
