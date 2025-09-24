// Approach1_StringSimulation.java
// Time: O(log n), Space: O(log n)

class Solution {
    public static int swapBits(int n) {
        String bin = Long.toBinaryString(n);

        if (bin.length() % 2 != 0) {
            bin = "0" + bin;
        }

        char[] arr = bin.toCharArray();

        for (int i = 0; i < arr.length; i += 2) {
            char temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        return (int) Long.parseLong(new String(arr), 2);
    }
}
