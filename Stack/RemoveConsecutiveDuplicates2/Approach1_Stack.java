// Approach1_Stack.java
// Time: O(n), Space: O(n)

class Solution {
    public static String removePair(String s) {
        if (s == null || s.isEmpty()) return "Empty String";

        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.removeLast());
        }

        return result.length() == 0 ? "Empty String" : result.toString();
    }
}
