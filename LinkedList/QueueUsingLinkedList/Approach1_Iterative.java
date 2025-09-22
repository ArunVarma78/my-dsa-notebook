// Approach1_Iterative.java
// Queue implemented using linked list with front and rear pointers
// Time: O(1) per operation, Space: O(n)

class MyQueue {
    QueueNode front, rear;

    // Push element into the queue
    void push(int a) {
        QueueNode temp = new QueueNode(a);
        if (rear == null) {
            front = rear = temp;
            return;
        }
        rear.next = temp;
        rear = rear.next;
    }

    // Pop front element from the queue
    int pop() {
        if (front == null) return -1;
        int res = front.data;
        front = front.next;
        if (front == null) rear = null;
        return res;
    }
}

/* Node class for reference
class QueueNode {
    int data;
    QueueNode next;
    QueueNode(int a) {
        data = a;
        next = null;
    }
}
*/
