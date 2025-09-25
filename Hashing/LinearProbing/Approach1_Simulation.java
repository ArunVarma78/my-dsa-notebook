// Approach1_Simulation.java
// Time: O(n * m), Space: O(m)

class Solution {
    int[] linearProbing(int hash_size, int arr[], int sizeOfArray) {
        int[] hashtable = new int[hash_size];
        for (int i = 0; i < hash_size; i++) {
            hashtable[i] = -1;
        }

        for (int i = 0; i < sizeOfArray; i++) {
            int hashFunc = arr[i] % hash_size;
            int init = hashFunc;
            boolean canFill = true;

            while (hashtable[hashFunc] != -1) {
                if (hashtable[hashFunc] == arr[i]) {
                    canFill = false; // duplicate, skip
                    break;
                }
                hashFunc = (hashFunc + 1) % hash_size;
                if (init == hashFunc) { // looped around
                    canFill = false;
                    break;
                }
            }

            if (canFill) {
                hashtable[hashFunc] = arr[i];
            }
        }

        return hashtable;
    }
}
