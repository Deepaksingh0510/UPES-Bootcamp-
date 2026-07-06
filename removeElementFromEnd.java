
class Node {

    Node next;
    int value;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {

    Node head;

    LinkedList() {
        head = null;
    }

    void add(int value) {

        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node itr = head;

            while (itr.next != null) {
                itr = itr.next;
            }

            itr.next = newNode;
        }
    }

    void show() {

        Node itr = head;

        while (itr != null) {
            System.out.print(itr.value);

            if (itr.next != null) {
                System.out.print(" -> ");
            }

            itr = itr.next;
        }

        System.out.println();
    }
}

class Solution {

    Node remove(Node head, int k) {

        Node dummy = new Node(0);
        dummy.next = head;

        Node slow = dummy;
        Node fast = dummy;

        // Move fast k+1 steps ahead
        for (int i = 0; i <= k; i++) {
            fast = fast.next;
        }

        // Move both pointers
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Delete the node
        slow.next = slow.next.next;

        return dummy.next;
    }
}

public class removeElementFromEnd {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();

        int arr[] = {1, 2, 3, 4, 5};

        for (int x : arr) {
            l.add(x);
        }

        System.out.println("Original List:");
        l.show();

        int k = 2;

        Solution s = new Solution();

        l.head = s.remove(l.head, k);

        System.out.println("After Removing:");
        l.show();
    }
}
