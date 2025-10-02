//Approach2_RegexSplit.java
//Time: O(|s|), Space: O(|s|)

class Solution {
    public static int findSum(String s) {
        int sum = 0;

        // Split non-digits, keep only numbers
        String[] parts = s.split("[^0-9]+");

        for (String part : parts) {
            if (!part.isEmpty()) {
                sum += Integer.parseInt(part);
            }
        }

        return sum;
    }
}
