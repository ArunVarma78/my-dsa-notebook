// Approach1_LinearSearch.java
// Linear search up to sqrt(n)
// Time: O(√n), Space: O(1)

class Solution {
    int floorSqrt(int n) {
        int i = 1;
        
        while (i * i < n) {
            i++;
        }
        
        return i * i == n ? i : i - 1;
    }
}
