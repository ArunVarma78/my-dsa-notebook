// Approach2_Compact.java
// Time: O(n * m), Space: O(m)

class Solution {
    int[] linearProbing(int hash_size, int arr[], int sizeOfArray) {
        int[] hashTable = new int[hash_size];
        for (int i = 0; i < hash_size; i++) {
            hashTable[i] = -1;
        }

        for (int i = 0; i < sizeOfArray; i++) {
            int index = arr[i] % hash_size;
            int startIndex = index;

            while (hashTable[index] != -1 && hashTable[index] != arr[i]) {
                index = (index + 1) % hash_size;
                if (startIndex == index) break; // full loop
            }

            if (hashTable[index] == -1) {
                hashTable[index] = arr[i];
            }
        }

        return hashTable;
    }
}
