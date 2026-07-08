 
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


    void show(){
        Node itr=head;

        while(itr!=null){
            System.out.print(itr.value+" -> ");
            itr=itr.next;
        }
    }


    void revrse(){
        Node prev=null;
        Node curr=head;

        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        head=prev;
    }
}

public class reverseLinkedList {

    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);

        l.show();

        System.out.println();

        l.revrse();

        l.show();
    }
}
