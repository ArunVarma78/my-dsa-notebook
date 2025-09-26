// Approach1_TwoPass.java
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

        boolean increasing = true, decreasing = true;

        Node curr = head;
        while(curr.next != null){
            if(curr.data > curr.next.data) {
                increasing = false;
                break;
            }
            curr = curr.next;
        }

        curr = head;
        while(curr.next != null){
            if(curr.data < curr.next.data){
                decreasing = false;
                break;
            }
            curr = curr.next;
        }

        return increasing || decreasing;
    }
}
