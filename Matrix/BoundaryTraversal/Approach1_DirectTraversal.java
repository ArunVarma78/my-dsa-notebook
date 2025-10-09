// Approach 1: Direct boundary traversal
// Time: O(M + N), Space: O(1) extra

import java.util.*;

class Solution {
    static ArrayList<Integer> boundaryTraversal(int mat[][]) {
        ArrayList<Integer> arrList = new ArrayList<>();
        int m = mat.length, n = mat[0].length;

        // top row
        for (int i = 0; i < n; i++) {
            arrList.add(mat[0][i]);
        }

        // right column
        for (int j = 1; j < m; j++) {
            arrList.add(mat[j][n - 1]);
        }

        // bottom row and left column only if matrix has >1 row/col
        if (m > 1 && n > 1) {
            // bottom row
            for (int i = n - 2; i >= 0; i--) {
                arrList.add(mat[m - 1][i]);
            }

            // left column
            for (int j = m - 2; j > 0; j--) {
                arrList.add(mat[j][0]);
            }
        }

        return arrList;
    }
}
