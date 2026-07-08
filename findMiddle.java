
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
    Node findM(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast.next=fast.next.next;
        }

        return slow;
    }


    //without fast and slow method
    Node find(Node head){
        Node itr=head;
        int count=0;

        while(itr!=null){
            count++;
            itr=itr.next;
        }
        itr=head;

        for(int i=0;i<count/2;i++){
            itr=itr.next;
        }
        return itr;



        
    }
}

class  findMiddle{

    public static void main(String args[]) {
        LinkedList l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.show();

        System.out.println();
        Solution s=new Solution();
        Node middle=s.find(l.head);
        System.out.println(middle.value);
    }
}
