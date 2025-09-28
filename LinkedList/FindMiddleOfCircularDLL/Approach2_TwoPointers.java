// Approach2_TwoPointers.java
// Time: O(n), Space: O(1)

class Solution {
    public static int findMiddle(Node head) {
        if (head == null) return -1;

        Node slow = head, fast = head;
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }
}
