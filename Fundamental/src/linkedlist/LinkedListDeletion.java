package linkedlist;

import exception.CustomException;
import node.ListNode;

public class LinkedListDeletion extends CommonOperation {

    private static int length = 0;
    private static ListNode head;

    public static int getLength() {
        return length;
    }

    public static void setLength(int length) {
        LinkedListDeletion.length = length;
    }

    public static ListNode getHead() {
        return head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    public static int getLength(ListNode head) {
        int count = 0;
        if (head == null) {
            return 0;
        } else if (head.getNext() == null) {
            return 1;
        } else {
            ListNode currentNode = head;
            while (currentNode != null) {
                count++;
                currentNode = currentNode.getNext();
            }
            return count;
        }
    }

    public static void deletionAtBegin() throws CustomException {
        if (head == null) {
            throw new CustomException("Action delete cannot be performed as the list is empty");
        } else if (head.getNext() == null) {
            head = null;
        } else {
            head = head.getNext();
        }
    }

    public static ListNode deletionAtEnd() throws CustomException {
        if (head == null) {
            throw new CustomException("Action delete cannot be performed as the list is empty");
        } else if (head.getNext() == null) {
            return null;
        } else {
            ListNode previousNode = head;
            while (previousNode.getNext().getNext() != null) {
                previousNode = previousNode.getNext();
            }
            previousNode.setNext(null);
            return previousNode;
        }
    }

    public static ListNode deletionAtMiddle(int pos) throws CustomException {
        if (pos > getLength()) {
            throw new CustomException(String.format(
                    "Action delete cannot be performed as position is invalid , length of list {}", getLength()));
        }

        int count = 0;
        if (head == null) {
            throw new CustomException("Action delete cannot be performed as the list is empty");
        } else if (head.getNext() == null && pos == count + 1) {
            return null;
        } else {
            ListNode c = head;
            for (ListNode q = head.getNext(); c.getNext() != null; c = c.getNext(), q = c.getNext()) {
                count++;
                if ((count + 1) == pos) {
                    c.setNext(q);
                }
            }
            return c;
        }
    }

    public static ListNode insertAtEnd(ListNode node) {
        if (head == null) {
            head = node;
            length++;
        } else {
            ListNode currentNode = head ;
            while(currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(node);
            length++;
        }
        return head;
    }
}
