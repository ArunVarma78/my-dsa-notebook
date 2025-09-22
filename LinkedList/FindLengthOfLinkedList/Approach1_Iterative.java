// Approach1_Iterative.java
// Iterative traversal to count nodes
// Time: O(n), Space: O(1)

class Solution {
    public int getCount(Node head) {
        int count = 0;
        Node curr = head;
        
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        
        return count;
    }
}

/* Node class for reference
class Node {
    int data;
    Node next;
    Node(int a) {  
        data = a; 
        next = null; 
    }
}
*/
