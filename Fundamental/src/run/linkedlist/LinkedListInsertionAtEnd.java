package run.linkedlist;

import linkedlist.LinkedListInsertion;
import node.ListNode;


public class LinkedListInsertionAtEnd extends StaticDataLoader {

    public static void main(String[] args) {
        loadData();
        LinkedListInsertion.traverse(LinkedListInsertion.getHead());

    }


}
