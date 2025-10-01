// Approach1_HashSet.java
// Time: O(n), Space: O(1)

class Solution {
    static int repeatedCharacter(String S) {
        HashSet<Character> seen = new HashSet<>();
        int res = -1;
        
        // Traverse from right → left, so we always keep leftmost duplicate
        for (int i = S.length() - 1; i >= 0; i--) {
            if (seen.contains(S.charAt(i))) {
                res = i;
            }
            seen.add(S.charAt(i));
        }
        
        return res;
    }
}
