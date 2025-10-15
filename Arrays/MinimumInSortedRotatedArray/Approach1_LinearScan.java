class Solution {
    static int minNumber(int arr[], int low, int high) {
        int min = Integer.MAX_VALUE;
        for (int i : arr)
            min = Math.min(min, i);
        return min;
    }
}
