// Approach1_DutchNationalFlag.java
// Three-way partition using Dutch National Flag algorithm
// Time: O(n), Space: O(1)

class Solution {
    public void threeWayPartition(int arr[], int a, int b) {
        int low = 0, mid = 0, high = arr.length - 1;
        
        while (mid <= high) {
            if (arr[mid] < a) {
                // move smaller elements to front
                int temp = arr[low];
                arr[low++] = arr[mid];
                arr[mid++] = temp;
            } else if (arr[mid] >= a && arr[mid] <= b) {
                // keep elements in range in middle
                mid++;
            } else {
                // move greater elements to back
                int temp = arr[high];
                arr[high--] = arr[mid];
                arr[mid] = temp;
            }
        }
    }
}
