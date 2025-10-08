# Quadratic Probing in Hashing

- Problem: [GeeksforGeeks - Quadratic Probing in Hashing](https://www.geeksforgeeks.org/problems/quadratic-probing-in-hashing-1587115621/0)  
- Description: Given an array of integers and a hash table size `m`, insert elements into the hash table using **Quadratic Probing** for collision handling.

---

## Approach

1. **Approach1_QuadraticProbing.java**
   - Initialize hash table with `-1`.
   - For each element, compute initial index as `arr[i] % m`.
   - If collision occurs, resolve using formula:  
     `newIndex = (originalIndex + i^2) % m`  
     where `i` is the number of collisions encountered so far.
   - Insert when an empty slot is found.
   - Time: O(N * M) worst-case, Space: O(M)

---
