

public class reverseAdjacentNodes {
    Node swap(Node head){

        if(head==null ||head.next==null){
            return head;
        }
        Node curr=head.next;
        Node prev=head;

        head=curr;

        while(curr!=null){
            prev.next=curr.next;
            curr.next=prev;

            if(prev.next==null || prev.next.next==null){
                break;
            }

            Node temp=prev.next;
            prev.next=temp.next;


            prev=temp;
            curr=temp.next;

        }

        return head;
    }
}
