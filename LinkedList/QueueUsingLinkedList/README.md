# Queue using Linked List

- Problem: [GeeksforGeeks - Implement Queue using Linked List](https://www.geeksforgeeks.org/problems/implement-queue-using-linked-list/0)
- Description: Implement a queue using a linked list.  
  - Query type 1 x → push x into the queue  
  - Query type 2 → pop front element and return it (return -1 if empty)

## Approaches

1. **Approach1_Iterative.java**
   - Maintain `front` and `rear` pointers  
   - Push by adding at `rear`  
   - Pop by removing from `front`  
   - Time: O(1) per operation, Space: O(n)
