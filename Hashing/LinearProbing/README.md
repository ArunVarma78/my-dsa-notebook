# Linear Probing in Hashing

- Problem: [GeeksforGeeks](https://www.geeksforgeeks.org/problems/linear-probing-in-hashing-1587115620/0)  
- Description: Insert elements into a hash table of size `m` using **linear probing** for collision resolution.  
  - Duplicates map to the same slot.  
  - Collisions are handled by checking the next slot `(index + 1) % m`.  
  - If table is full, discard the element.

---

## Examples
- Input: arr = [3, 11, 10], m = 3 → Output: [3, 10, 11]  
- Input: arr = [4, 14, 24, 44], m = 10 → Output: [-1, -1, -1, -1, 4, 14, 24, 44, -1, -1]  
- Input: arr = [5, 5, 5, 5, 5], m = 5 → Output: [5, -1, -1, -1, -1]  

---

## Approaches

1. **Approach1_Simulation.java**  
   - Simulates probing with explicit flags  
   - Keeps track of starting index to avoid infinite loops  
   - Time: O(n * m), Space: O(m)

2. **Approach2_Compact.java**  
   - Cleaner loop with duplicate check inline  
   - Time: O(n * m), Space: O(m)
