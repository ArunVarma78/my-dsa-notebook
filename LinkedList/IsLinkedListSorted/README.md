# Is Linked List Sorted

- Problem: [GeeksforGeeks - Is Linked List Sorted](https://www.geeksforgeeks.org/problems/is-linked-list-sorted/0)
- Description: Given the head of a singly linked list, determine whether the list is sorted. Sorting can be **non-increasing** or **non-decreasing**.

---

## Approaches

1. **Approach1_TwoPass.java**
   - Two passes: first check increasing, then decreasing
   - Time: O(n), Space: O(1)

2. **Approach2_OnePass.java**
   - Single pass: track both increasing and decreasing flags simultaneously
   - Time: O(n), Space: O(1)
