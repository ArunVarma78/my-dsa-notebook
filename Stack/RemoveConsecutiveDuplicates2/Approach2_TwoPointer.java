// Approach2_TwoPointer.java
// Time: O(n), Space: O(n)

class Solution {
    public static String removePair(String s) {
        if (s == null || s.isEmpty()) return "Empty String";

        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == ch) {
                sb.deleteCharAt(len - 1);
            } else {
                sb.append(ch);
            }
        }

        return sb.length() == 0 ? "Empty String" : sb.toString();
    }
}
