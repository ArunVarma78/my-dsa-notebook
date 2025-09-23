// Approach2_BinarySearch.java
// Binary search to find floor of sqrt(n)
// Time: O(log n), Space: O(1)

class Solution {
    int floorSqrt(int n) {
        int low = 1, high = n;
        
        if (n <= 0) return 0;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return high;
    }
}
