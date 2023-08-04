package run.linkedlist;

import linkedlist.LinkedListInsertion;
import node.ListNode;


public class LinkedListIndertionAtBegin {

    public static void main(String[] args) {

        int i =10;
        while (--i > 0) {
            LinkedListInsertion.insertAtStart(new ListNode(i));
        }
        LinkedListInsertion.traverse(LinkedListInsertion.getHead());

    }


}
