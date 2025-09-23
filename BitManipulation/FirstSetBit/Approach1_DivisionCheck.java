// Approach1_DivisionCheck.java
// Time: O(log n), Space: O(1)

class Solution {
    public static int getFirstSetBit(int n) {
        int count = 1;
        while (n > 0) {
            if (n % 2 != 0) {
                return count;
            }
            count++;
            n = n / 2;
        }
        return 0;
    }
}
