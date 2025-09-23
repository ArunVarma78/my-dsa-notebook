// Approach2_BitwiseAnd.java
// Time: O(log n), Space: O(1)

class Solution {
    public static int getFirstSetBit(int n) {
        int count = 1;
        for (int i = 1; i <= n; i = i * 2) {
            if ((n & i) != 0) {
                return count;
            }
            count++;
        }
        return 0;
    }
}
