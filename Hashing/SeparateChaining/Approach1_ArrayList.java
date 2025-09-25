// Approach1_ArrayList.java
// Time: O(n), Space: O(n)

import java.util.*;

class Solution {
    public ArrayList<ArrayList<Integer>> separateChaining(int arr[], int n, int hashSize) {
        ArrayList<ArrayList<Integer>> hashTable = new ArrayList<>(hashSize);

        for (int i = 0; i < hashSize; i++) {
            hashTable.add(new ArrayList<>());
        }

        for (int num : arr) {
            int idx = num % hashSize;
            hashTable.get(idx).add(num);
        }

        return hashTable;
    }
}
