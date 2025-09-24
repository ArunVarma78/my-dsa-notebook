// Approach2_ExtendedEuclidean.java
// Time: O(log(min(a, m))), Space: O(1)

class Solution {
    private static int extendedGCD(int a, int b, int[] xy) {
        if (b == 0) {
            xy[0] = 1;
            xy[1] = 0;
            return a;
        }
        int[] temp = new int[2];
        int gcd = extendedGCD(b, a % b, temp);

        xy[0] = temp[1];
        xy[1] = temp[0] - (a / b) * temp[1];
        return gcd;
    }

    public int modInverse(int a, int m) {
        int[] xy = new int[2];
        int g = extendedGCD(a, m, xy);

        if (g != 1) return -1;

        return (xy[0] % m + m) % m; // Ensure positive result
    }
}
