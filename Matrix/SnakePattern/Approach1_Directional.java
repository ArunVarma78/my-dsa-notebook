// Approach 1: Using direction tracking variable (j)
// Time: O(N^2), Space: O(1) extra

import java.util.*;

class Solution {
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        int m = matrix.length, n = matrix[0].length;
        ArrayList<Integer> arrList = new ArrayList<>();

        int j = 0;
        for (int i = 0; i < m; i++) {
            if (j == 0) {
                for (; j < n; j++) {
                    arrList.add(matrix[i][j]);
                }
                j--; // move back to last index
            } else {
                for (; j >= 0; j--) {
                    arrList.add(matrix[i][j]);
                }
                j++; // move forward to 0
            }
        }

        return arrList;
    }
}
