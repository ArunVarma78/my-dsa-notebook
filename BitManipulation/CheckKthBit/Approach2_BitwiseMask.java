// Approach2_BitwiseMask.java
// Time: O(1), Space: O(1)

class CheckBit {
    static boolean checkKthBit(int n, int k) {
        return (n & (1 << k)) != 0;
    }
}
