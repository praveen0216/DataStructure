package linkedlist;

import exception.CustomException;
import node.ListNode;

public class LinkedListInsertion extends CommonOperation {

    static ListNode head;
    private static int length =0 ;

    public static ListNode getHead() {
        return head;
    }

    public static void setHead(ListNode head) {
        LinkedListInsertion.head = head;
    }

    public static int getLength() {
        return length;
    }

    public static void setLength(int length) {
        LinkedListInsertion.length = length;
    }

    public static int getLength(ListNode head) {
        ListNode currentNode = head ;
        if (head == null) {
            return 0;
        } else if (head.getNext() == null) {
            return 1;
        } else {
            while(currentNode.getNext() != null) {
                length++;
            }
            return length;
        }

    }

    public static ListNode insertAtStart(ListNode node) {
        if (head == null) {
            length++;
            head = node;
        } else {
            node.setNext(head);
            head = node;
            length++;
        }
        return head;
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

    public static ListNode insertInMiddle(ListNode node, int pos) throws CustomException {
        if(pos > length) {
            throw new CustomException("Position cannot be greater than total number of nodes");
        }
        if (head == null) {
            head = node;
            length++;
        } else {
            ListNode previous = head;
            int i = 0;
            for(ListNode cN = head; cN.getNext() != null; previous = cN, cN =  cN.getNext() , i++) {
                if ( i == pos) {
                    node.setNext(cN);
                    previous.setNext(node);
                    length++;
                    break;
                }
            }
        }
        return head;
    }

}
