# Find Middle of Circular Doubly Linked List

- Problem: [GeeksforGeeks - Find Middle of Circular Doubly Linked List](https://www.geeksforgeeks.org/problems/find-middle-of-circular-doubly-linked-list/0)  
- Description: Given the head of a circular doubly linked list of odd size, return the middle element.  
  The tail connects back to head, and head’s `prev` points to tail.

---

## Approaches

1. **Approach1_CountTraversal.java**
   - Count total nodes, then move `count/2` steps from head.
   - Time: O(n), Space: O(1)

2. **Approach2_TwoPointers.java**
   - Use slow and fast pointers to reach middle efficiently.
   - Time: O(n), Space: O(1)
