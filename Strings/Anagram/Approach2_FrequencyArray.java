// Approach 2: Frequency Array
// Time: O(n), Space: O(26) ~ O(1)

class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] freq = new int[26];

        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : s2.toCharArray()) {
            if (freq[c - 'a']-- == 0) return false;
        }

        return true;
    }
}
