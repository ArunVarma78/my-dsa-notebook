// Approach 1: Two Pointer Technique (Optimal)
// Time: O(n + m)
// Space: O(1) excluding result list

import java.util.*;

class Solution {
    public static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        int n1 = arr1.length, n2 = arr2.length;

        while (i < n1 && j < n2) {
            if (arr1[i] == arr2[j]) {
                // avoid duplicates
                if (res.isEmpty() || res.get(res.size() - 1) != arr1[i])
                    res.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return res;
    }
}
