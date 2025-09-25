// Approach2_BinarySearch.java
// Time: O(log n), Space: O(1)

class Solution {
    static int findFloor(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        int floorIdx = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= x) {
                floorIdx = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return floorIdx;
    }
}
