package linkedlist;

import node.ListNode;

public class CommonOperation {

    public static void traverse(ListNode head) {
        ListNode currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
    }

    public static void traverse(ListNode head, ListNode lastNode) {
       for(ListNode p = head; p!=null ; p = p.getNext()) {
           System.out.print(p.getData() + " ");
           if (p == lastNode) break;
       }
    }
}
