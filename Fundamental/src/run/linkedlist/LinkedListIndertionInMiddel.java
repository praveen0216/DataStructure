package run.linkedlist;

import exception.CustomException;
import linkedlist.LinkedListInsertion;
import node.ListNode;


public class LinkedListIndertionInMiddel {

    public static void main(String[] args) throws CustomException {

        int i =10;
        while (--i > 0) {
            LinkedListInsertion.insertAtStart(new ListNode(i));
        }

        LinkedListInsertion.insertInMiddle(new ListNode(15), 3);
        LinkedListInsertion.traverse(LinkedListInsertion.getHead());

    }


}
