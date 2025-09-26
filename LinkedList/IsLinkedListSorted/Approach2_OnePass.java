// Approach2_OnePass.java
// Time: O(n), Space: O(1)

/*
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public static boolean isSorted(Node head) {
        if(head == null) return true;

        boolean isInc = true, isDec = true;

        Node curr = head;
        while(curr.next != null && (isInc || isDec)){
            if(curr.data > curr.next.data) isInc = false;
            if(curr.data < curr.next.data) isDec = false;
            curr = curr.next;
        }

        return isInc || isDec;
    }
}
