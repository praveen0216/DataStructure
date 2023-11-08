package run.linkedlist;

import exception.CustomException;
import linkedlist.LinkedListDeletion;
import node.ListNode;

public class LinkedListDeletionAtMiddle {

        public static void main(String[] args) throws CustomException {
            int i =10;
            while (--i > 0) {
                LinkedListDeletion.insertAtEnd(new ListNode(i));
            }
            System.out.println("Before deletion --->");
            LinkedListDeletion.traverse(LinkedListDeletion.getHead());
            ListNode lastNode = LinkedListDeletion.deletionAtMiddle(2);

            System.out.println("\nAfter deletion --->");
            LinkedListDeletion.traverse(LinkedListDeletion.getHead(), lastNode);
        }
}
