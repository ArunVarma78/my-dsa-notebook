// Approach 1: Run Length Counting
// Time: O(n), Space: O(1)

class Solution {
    public static long modified(String a) {
        if (a.length() <= 2) return 0;

        int repeat = 1, res = 0;
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) != a.charAt(i - 1)) {
                if (repeat > 2) {
                    if (repeat % 2 == 0) res += repeat / 2 - 1;
                    else res += repeat / 2;
                }
                repeat = 1;
            } else {
                repeat++;
            }
        }

        if (repeat > 2) {
            if (repeat % 2 == 0) res += repeat / 2 - 1;
            else res += repeat / 2;
        }

        return res;
    }
}
