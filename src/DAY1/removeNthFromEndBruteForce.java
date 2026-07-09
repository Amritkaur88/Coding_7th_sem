package DAY1;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class removeNthFromEndBruteForce {

    public static Node removeNthFromEnd(Node head, int n) {

        int length = 0;
        Node temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }


        if (n > length) {
            return head;
        }

        Node dummy = new Node(0);
        dummy.next = head;

        Node curr = dummy;

        for (int i = 0; i < length - n; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return dummy.next;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {


        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Original List: ");
        printList(head);

        int n = 2;

        head = removeNthFromEnd(head, n);

        System.out.print("After Removing " + n + "th DAY1.Node From End: ");
        printList(head);
    }
}
