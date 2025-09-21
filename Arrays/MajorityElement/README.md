# Majority Element

- Problem: [LeetCode 169](https://leetcode.com/problems/majority-element/)
- Description: Find the element that appears more than ⌊n/2⌋ times in the array. You may assume the majority element always exists.

## Approaches

1. **Approach1_HashMap.java**
   - Uses a HashMap to count frequencies
   - Returns element once count exceeds n/2
   - Time: O(n), Space: O(n)

2. **Approach2_BoyerMoore.java**
   - Boyer–Moore Voting Algorithm
   - Tracks candidate and counter, resets when counter hits zero
   - Time: O(n), Space: O(1) (optimal)
