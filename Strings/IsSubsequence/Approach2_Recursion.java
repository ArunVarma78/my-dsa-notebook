// Approach2_Recursion.java
// Time: O(|s1| + |s2|), Space: O(|s1| + |s2|) recursion stack

class Solution {
    public static boolean isSubSequence(String s1, String s2) {
        return helper(s1, s2, s1.length(), s2.length());
    }

    private static boolean helper(String s1, String s2, int n1, int n2) {
        if(n1 == 0) return true;     // all chars matched
        if(n2 == 0) return false;    // s2 exhausted

        if(s1.charAt(n1-1) == s2.charAt(n2-1)) {
            return helper(s1, s2, n1-1, n2-1);
        }
        return helper(s1, s2, n1, n2-1);
    }
}
