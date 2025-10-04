// Approach 2: Two Arrays (faster than HashMap)
// Time: O(n), Space: O(26*2) ~ O(1)

class Solution {
    public static boolean areIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i), c2 = s2.charAt(i);

            if (map1[c1] == 0 && map2[c2] == 0) {
                map1[c1] = c2;
                map2[c2] = c1;
            } else if (map1[c1] != c2 || map2[c2] != c1) {
                return false;
            }
        }
        return true;
    }
}
