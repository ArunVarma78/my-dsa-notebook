// Approach 1: HashMap + HashSet
// Time: O(n), Space: O(26) ~ O(1)

import java.util.*;

class Solution {
    public static boolean areIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> mapped = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i), c2 = s2.charAt(i);

            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) return false;
            } else {
                if (mapped.contains(c2)) return false;
                map.put(c1, c2);
                mapped.add(c2);
            }
        }

        return true;
    }
}
