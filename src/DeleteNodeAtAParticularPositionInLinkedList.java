import utilityClasses.ListNode;

import static java.lang.System.out;

/**
 * Created by angie on 6/14/17.
 */
public class DeleteNodeAtAParticularPositionInLinkedList {
    public static ListNode deleteAtMiddle(ListNode head, int position) {
        if (head == null) return null;
        ListNode prev = head;
        ListNode curr = head.next;
        if (position == 1) {
            head = head.next;
            return head;
        }
        int index = 2;
        while (curr.next != null) {
            if (index == position) break;
            index++;
            prev = prev.next;
            curr = curr.next;
        }
        if (index < position) return head;
        prev.next = curr.next;
        curr.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        ListNode returnNode = deleteAtMiddle(a, 6);
        ListNode print = returnNode;
        while (print != null) {
            System.out.println(print.data);
            print = print.next;
        }
    }
}
