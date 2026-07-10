
import java.util.HashSet;

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


    //deletion by value
    void deleteVal(int x){
        Node itr=head;

        while(itr!=null && itr.next!=null){
            if(itr.next.value==x){
                itr.next=itr.next.next;
            }
            itr=itr.next;
        }

    }
    //deletion by Node
    void deleteVal(Node n){
        n.value=n.next.value;
        n.next=n.next.next;

    }

    void show() {
        Node itr = head;

        while (itr != null) {
            System.out.print(itr.value + " -> ");
            itr = itr.next;
        }
    }
}

class Solution{

    //slow fast method
    boolean find(Node head){
        Node fast=head;
        Node slow=head;


        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;

    }


    boolean findL(Node head){
        HashSet<Node> set=new HashSet<>();
        Node itr=head;
        while(itr!=null){
            if(set.contains(itr)){
                return true;
            }else{
                set.add(itr);
                itr=itr.next;
            }
        }
        return false;
    }
}
class findLoop {

    public static void main(String args[]) {
        LinkedList l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        // connected last node to the node containing value 3
        Node third = l.head.next.next;
        Node last = l.head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = third;

        Solution s=new Solution();
        System.out.print(s.find(l.head));

    }
}
