# Bit Difference

- Problem: [GeeksforGeeks - Bit Difference](https://www.geeksforgeeks.org/problems/bit-difference-1587115620/0)
- Description: Count the number of bits that need to be flipped to convert integer `a` to integer `b`.  
  - Flipping means changing 1 → 0 or 0 → 1.

## Approaches

1. **Approach1_XORCountBits.java**
   - XOR the two numbers to find differing bits  
   - Count the number of 1s in the XOR result  
   - Time: O(log(max(a,b))), Space: O(1)
