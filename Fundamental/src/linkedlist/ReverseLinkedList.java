package linkedlist;


public class ReverseLinkedList {

    static class Node {
        int data ;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void printList(Node head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        Node node = new Node(10);
        node.next = new Node(20);
        node.next.next = new Node(30);
        node.next.next.next = new Node(40);
        node.next.next.next.next = new Node(50);
        node.next.next.next.next.next = new Node(60);

        reverseLinkedList.printList(reverseLinkedList.reverseLL(node));

    }

    private  Node reverseLL(Node node) {
        if (node == null) {
            return node;
        } else {
            Node prev = null;
            Node currentNode = node;
            Node next = node;
            while(currentNode != null) {
                next = currentNode.next;
                currentNode.next = prev;
                prev = currentNode;
                currentNode = next;
            }
            return prev;
        }
    }

}
