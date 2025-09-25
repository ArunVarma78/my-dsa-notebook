// Approach1_LinearSearch.java
// Time: O(n), Space: O(1)

class Solution {
    static int findFloor(int[] arr, int x) {
        int n = arr.length;

        if (x >= arr[n - 1]) return n - 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > x) return i - 1;
        }

        return -1;
    }
}
