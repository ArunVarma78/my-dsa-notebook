// Approach 1: Quadratic Probing
// Time: O(N * M) worst-case, Space: O(M)
// N = number of keys, M = hash size

class Solution {
    static void quadraticProbing(int[] hash, int hash_size, int arr[], int N) {
        // initialize hash table with -1
        for (int i = 0; i < hash.length; i++) {
            hash[i] = -1;
        }

        for (int i = 0; i < N; i++) {
            int hashFunc = arr[i] % hash_size;
            int k = 1;

            // quadratic probing until empty slot found or all tried
            while (hash[hashFunc] != -1 && hash[hashFunc] != arr[i]) {
                hashFunc = (arr[i] % hash_size + k * k) % hash_size;
                k++;
                if (k >= hash_size) break; // table full
            }

            if (hash[hashFunc] == -1) {
                hash[hashFunc] = arr[i];
            }
        }
    }
}
