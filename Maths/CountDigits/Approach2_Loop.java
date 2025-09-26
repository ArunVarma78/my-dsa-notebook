// Approach2_Loop.java
// Time: O(log n), Space: O(1)

class Solution {
    public static int countDigits(int n) {
        int count = 0;
        if (n == 0) return 1;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
