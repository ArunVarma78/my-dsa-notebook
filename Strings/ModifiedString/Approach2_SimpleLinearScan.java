// Approach 2: Simple Linear Scan
// Time: O(n), Space: O(1)

class Solution {
    public static long modified(String s) {
        int count = 1, insertions = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                if (count == 3) {
                    insertions++;
                    count = 1;
                }
            } else {
                count = 1;
            }
        }
        return insertions;
    }
}
