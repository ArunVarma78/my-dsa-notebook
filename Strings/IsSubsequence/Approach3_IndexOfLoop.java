// Approach3_IndexOfLoop.java
// Time: O(|s1| * |s2|) worst case, Space: O(1)

class Solution {
    public static boolean isSubSequence(String s1, String s2) {
        int pos = -1;
        for(char ch : s1.toCharArray()) {
            pos = s2.indexOf(ch, pos + 1);
            if(pos == -1) return false;
        }
        return true;
    }
}
