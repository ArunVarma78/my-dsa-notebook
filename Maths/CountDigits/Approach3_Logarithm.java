// Approach3_Logarithm.java
// Time: O(1), Space: O(1)

class Solution {
    public static int countDigits(int n) {
        if (n == 0) return 1;
        return (int) Math.floor(Math.log10(n)) + 1;
    }
}
