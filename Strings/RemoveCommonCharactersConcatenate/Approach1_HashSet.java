// Approach1_HashSet.java
// Use HashSets to remove common characters and concatenate
// Time: O(|s1| + |s2|), Space: O(|s1| + |s2|)

import java.util.HashSet;

class Solution {
    public static String concatenatedString(String s1, String s2) {
        HashSet<Character> freq1 = new HashSet<>();
        HashSet<Character> freq2 = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s1.length(); i++) {
            freq1.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            freq2.add(s2.charAt(i));
        }
        
        for (int i = 0; i < s1.length(); i++) {
            if (!freq2.contains(s1.charAt(i)))
                sb.append(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            if (!freq1.contains(s2.charAt(i)))
                sb.append(s2.charAt(i));
        }
        
        return sb.length() == 0 ? "-1" : sb.toString();
    }
}
