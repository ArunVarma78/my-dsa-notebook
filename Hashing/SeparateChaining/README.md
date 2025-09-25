# Separate Chaining in Hashing

- Problem: [GeeksforGeeks](https://www.geeksforgeeks.org/problems/separate-chaining-in-hashing-1587115621/0)  
- Description: Insert array elements into a hash table of size `hashSize` using Separate Chaining. Each slot may contain a list of values in insertion order.

## Approaches

1. **Approach1_ArrayList.java**
   - Use `ArrayList<ArrayList<Integer>>` to simulate chains
   - Compute index as `arr[i] % hashSize`
   - Append elements into respective chain
   - Time: O(n), Space: O(n)
