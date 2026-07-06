
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
}

class Solution {

    boolean check(Node head) {
        Node curr = head;

        int size = 0;
        while (curr != null) {
            size++;
            curr = curr.next;
        }

        curr = head;

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = curr.value;
            curr = curr.next;
        }

        int st = 0;
        int end = size - 1;

        while (st < end) {
            if (arr[st] != arr[end]) {
                return false;
            }
            st++;
            end--;

        }

        return true;
    }
}

class checkPalindrome {

    public static void main(String[] args) {
        int arr[] = {1, 4, 4, 1};

        LinkedList l = new LinkedList();
        for (int x : arr) {
            l.add(x);
        }

        Solution s = new Solution();
        System.out.println(s.check(l.head));
    }
}
