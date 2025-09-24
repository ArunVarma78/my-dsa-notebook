// Approach3_Masking.java
// Time: O(1), Space: O(1)

class Solution {
    public static int swapBits(int n) {
        int evenMask = 0xAAAAAAAA; // 1010...
        int oddMask  = 0x55555555; // 0101...

        int evenBits = (n & evenMask) >> 1;
        int oddBits  = (n & oddMask) << 1;

        return evenBits | oddBits;
    }
}
