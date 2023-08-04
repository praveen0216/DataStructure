package run.linkedlist;

import exception.CustomException;
import linkedlist.LinkedListInsertion;
import node.ListNode;


public class LinkedListInsertionInMiddel extends  StaticDataLoader {

    public static void main(String[] args) throws CustomException {
        loadData();
        LinkedListInsertion.insertInMiddle(new ListNode(15), 3);
        LinkedListInsertion.traverse(LinkedListInsertion.getHead());

    }


}
