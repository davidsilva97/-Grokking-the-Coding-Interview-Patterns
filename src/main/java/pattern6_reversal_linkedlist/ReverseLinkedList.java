package pattern6_reversal_linkedlist;



public class ReverseLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data; // Can be a generic type
        private ListNode next; // Reference to next ListNode in list

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void print(ListNode head) {
        ListNode current = head;
        while(current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null\n");
    }

    public ListNode reverse(ListNode head) {
        if(head == null) {
            return null;
        }

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode second = new ListNode(45);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(1);

        head.next = second;
        second.next = third;
        third.next = fourth;

        ReverseLinkedList app = new ReverseLinkedList();
        app.print(head);

        ListNode reverse = app.reverse(head);
        app.print(reverse);
    }
}
