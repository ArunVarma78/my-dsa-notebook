// Approach 2: Using HashSet
// Time: O(n + m)
// Space: O(n) due to HashSet

import java.util.*;

class Solution {
    public static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int num : arr1) set.add(num);

        for (int num : arr2) {
            if (set.contains(num)) {
                res.add(num);
                set.remove(num); // to avoid duplicates
            }
        }

        Collections.sort(res); // since arrays were sorted, keep order
        return res;
    }
}
