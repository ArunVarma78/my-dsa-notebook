// Approach1_CountTraversal.java
// Time: O(n), Space: O(1)

class Solution {
    public static int findMiddle(Node head) {
        if (head == null) return -1;

        int count = 1;
        for (Node curr = head.next; curr != head; curr = curr.next) {
            count++;
        }

        int mid = count / 2;
        Node curr = head;
        for (int i = 0; i < mid; i++) {
            curr = curr.next;
        }

        return curr.data;
    }
}
