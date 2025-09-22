// Approach1_XORCountBits.java
// XOR two numbers and count set bits
// Time: O(log(max(a,b))), Space: O(1)

class Solution {
    public static int countBitsFlip(int a, int b) {
        int count = 0;
        int xor = a ^ b;

        while (xor > 0) {
            if ((xor & 1) == 1)
                count++;
            xor >>= 1;
        }
        return count;
    }
}
