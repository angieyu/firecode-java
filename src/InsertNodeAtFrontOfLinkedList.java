import static java.lang.System.out;

import utilityClasses.ListNode;

/**
 * Created by angie on 6/7/17.
 */
public class InsertNodeAtFrontOfLinkedList {
    public static ListNode insertAtHead(ListNode head, int data) {
        // make a new ListNode
        ListNode curr = new ListNode(data);
        // set next to the head that is passed in
        curr.next = head;
        return curr;
    }

    public static void main(String[] args) {
        // test data
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.data = 1;
        b.data = 2;
        c.data = 3;
        d.data = 4;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        insertAtHead(a, 5);
    }
}
