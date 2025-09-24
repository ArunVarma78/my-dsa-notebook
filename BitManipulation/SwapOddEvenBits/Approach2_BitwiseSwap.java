// Approach2_BitwiseSwap.java
// Time: O(32), Space: O(1)

class Solution {
    public static int swapBits(int n) {
        for (int i = 0; i < 32; i += 2) {
            int bit1 = (n >> i) & 1;
            int bit2 = (n >> (i + 1)) & 1;

            if (bit1 != bit2) {
                n ^= (1 << i);
                n ^= (1 << (i + 1));
            }
        }
        return n;
    }
}
