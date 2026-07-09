package DAY1;

class listnode1 {
    int val;
    listnode1 next;

    listnode1() {}

    listnode1(int val) {
        this.val = val;
    }

    listnode1(int val, listnode1 next) {
        this.val = val;
        this.next = next;
    }
}

public class removeNthFromEndOptimized{

    // Remove nth node from end
    public listnode1 removeNthFromEnd(listnode1 head, int n) {

        listnode1 dummy = new listnode1(0);
        dummy.next = head;

        listnode1 fast = dummy;
        listnode1 slow = dummy;

        // Move fast pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the nth node
        slow.next = slow.next.next;

        return dummy.next;
    }

    // Print Linked List
    public static void printList(listnode1 head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Linked List: 1 -> 2 -> 3 -> 4 -> 5
        listnode1 head = new listnode1(1);
        head.next = new listnode1(2);
        head.next.next = new listnode1(3);
        head.next.next.next = new listnode1(4);
        head.next.next.next.next = new listnode1(5);

        int n = 2; // Remove 2nd node from end

        removeNthFromEndOptimized obj = new removeNthFromEndOptimized();
        head = obj.removeNthFromEnd(head, n);

        System.out.print("Updated List: ");
        printList(head);
    }
}