// Approach1_ShiftAndMask.java
// Time: O(1), Space: O(1)

class CheckBit {
    static boolean checkKthBit(int n, int k) {
        return ((n >> k) & 1) == 1;
    }
}
