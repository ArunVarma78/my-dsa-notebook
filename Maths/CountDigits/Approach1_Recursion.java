// Approach1_Recursion.java
// Time: O(log n), Space: O(log n)

class Solution {
    public static int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);
    }
}
