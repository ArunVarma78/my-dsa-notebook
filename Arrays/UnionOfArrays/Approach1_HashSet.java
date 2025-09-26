// Approach1_HashSet.java
// Time: O(n + m), Space: O(n + m)

class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer> hash = new HashSet<>();
        for (int num : a) hash.add(num);
        for (int num : b) hash.add(num);
        
        return new ArrayList<>(hash);
    }
}
