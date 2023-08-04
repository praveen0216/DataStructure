package run.linkedlist;

import linkedlist.LinkedListInsertion;
import node.ListNode;


public class LinkedListIndertionAtEnd {

    public static void main(String[] args) {

        int i =10;
        while (--i > 0) {
            LinkedListInsertion.insertAtEnd(new ListNode(i));
        }
        LinkedListInsertion.traverse(LinkedListInsertion.getHead());

    }


}
