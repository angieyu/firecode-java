import utilityClasses.ListNode;

/**
 * Created by angie on 6/2/17.
 */
public class listNodeRemoveLast {
    public static ListNode deleteAtTail(ListNode head) {
        // have two pointers A & B, A will stay one previous to B
        ListNode current = head;
        ListNode pointer = head;
        // use a while loop to move through the linked list
        while (!(current.next == null)) {
            pointer = current;
            current = current.next;
        }
        // delete last node
        pointer.next = null;
        // return head
        return head;
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
        ListNode returnNode = deleteAtTail(a);
        // print linked list to check if last one was deleted
        ListNode printNode = returnNode;
        System.out.println(printNode.data);
        while (!(printNode.next == null)) {
            printNode = printNode.next;
            System.out.println(printNode.data);
        }
    }
}