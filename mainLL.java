
class Node {

    int value;
    Node next;

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
            System.out.print(itr.value + " -> ");
            itr = itr.next;
        }
    }
}

class mainLL {

    public static void main(String args[]) {
        LinkedList l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.show();
    }
}
