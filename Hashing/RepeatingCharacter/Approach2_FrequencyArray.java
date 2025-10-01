// Approach2_FrequencyArray.java
// Time: O(n), Space: O(1)

class Solution {
    static int repeatedCharacter(String S) {
        int[] freq = new int[256]; // ASCII characters
        int res = -1;

        for (int i = S.length() - 1; i >= 0; i--) {
            char ch = S.charAt(i);
            if (freq[ch] > 0) {
                res = i;
            }
            freq[ch]++;
        }

        return res;
    }
}
