package run.linkedlist;

import linkedlist.LinkedListInsertion;
import node.ListNode;

public class StaticDataLoader {

    public static void loadData() {
        int i =10;
        while (--i > 0) {
            LinkedListInsertion.insertAtEnd(new ListNode(i));
        }
    }
}
