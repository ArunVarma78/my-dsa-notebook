# Digital Root

- Problem: [GeeksforGeeks](https://www.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/0)
- Description: Find the digital root of a number. The digital root is the recursive sum of its digits until we get a single digit.

## Approaches

1. **Approach1_Recursive.java**
   - Recursively sums digits until a single digit remains.
   - Time: O(d), Space: O(d) (stack), where d = number of digits.

2. **Approach2_Iterative.java**
   - Uses iteration with repeated digit sum until single digit.
   - Time: O(d), Space: O(1).

3. **Approach3_Formula.java**
   - Uses modulo math: `digitalRoot = 1 + (n - 1) % 9`
   - Time: O(1), Space: O(1) (most optimal).
