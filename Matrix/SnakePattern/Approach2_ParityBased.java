// Approach 2: Using row index parity check (simpler & preferred)
// Time: O(N^2), Space: O(1) extra

import java.util.*;

class Solution {
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        int m = matrix.length, n = matrix[0].length;
        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                // left to right
                for (int j = 0; j < n; j++) {
                    arrList.add(matrix[i][j]);
                }
            } else {
                // right to left
                for (int j = n - 1; j >= 0; j--) {
                    arrList.add(matrix[i][j]);
                }
            }
        }

        return arrList;
    }
}
