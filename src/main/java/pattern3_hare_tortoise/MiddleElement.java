package pattern3_hare_tortoise;

public class MiddleElement {
    private Node head;
    //In constructor, Initialize head attribute to null
    public MiddleElement() {
        this.head = null;
    }

    public Node insert(int data) {

        if (head == null) {
            head = new Node(data);
        } else {
            // Create a new node
            Node temp = new Node(data);
            // New node points to head
            temp.next = head;
            // Head points to a new node
            head = temp;
        }
        return head;
    }
    //Logic to print middle element of a linked list
    public void printMiddleElement() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("\nMiddle Element of a Linked List is " + slow.data);
    }

    public void print() {
        Node temp = head;
        /*
         * Traverse a list and check if it not points to null. If it points to
         * null, It means there is no node present after that and we need to end
         * the loop.
         */
        while (temp != null) {
            if(temp.next == null){
                System.out.print(temp.data);
                break;
            }
            System.out.print(temp.data+",");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {

        MiddleElement ll = new MiddleElement();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);

        ll.print();
        ll.printMiddleElement();
    }
}
