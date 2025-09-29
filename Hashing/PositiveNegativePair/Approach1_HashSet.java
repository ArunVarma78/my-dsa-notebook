// Approach1_HashSet.java
// Time: O(n), Space: O(n)

import java.util.*;

class Solution {
    public static ArrayList<Integer> findPairs(int arr[], int n) {
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int val = arr[i];
            if (set.contains(-val)) {
                result.add(Math.min(val, -val));
                result.add(Math.max(val, -val));
            }
            set.add(val);
        }

        if (result.isEmpty()) return new ArrayList<>(Arrays.asList(0));
        return result;
    }
}
