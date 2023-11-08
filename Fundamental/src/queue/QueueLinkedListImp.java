package queue;

public class QueueLinkedListImp {

    static class QNode {
        QNode next;
        int data;
        QNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        int capacity;
        QNode front, rear;
        Queue() {
            front = null;
            rear = null;
        }

    }
}
