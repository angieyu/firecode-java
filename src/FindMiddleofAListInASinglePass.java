import utilityClasses.ListNode;

import static java.lang.System.out;

/**
 * Created by angie on 6/7/17.
 */
public class FindMiddleofAListInASinglePass {
    public static ListNode findMiddleNode(ListNode head) {
        // edge case
        if (head == null) return null;
        // use two pointer, the fast pointer travels twice as fast as the slow one
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null) {
            fast = (fast.next).next;
            if (fast == null) return slow;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {

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
        ListNode returnNode = findMiddleNode(a);
        out.println(returnNode.data);
    }
}
