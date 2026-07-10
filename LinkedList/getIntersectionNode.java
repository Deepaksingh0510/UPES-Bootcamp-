/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> s1=new HashSet<>();
        ListNode itr=headA;

        while(itr!=null){
            s1.add(itr);
            itr=itr.next;
        }
        itr=headB;
        while(itr!=null){
            if(s1.contains(itr)){
                return itr;
            }
            itr=itr.next;
        }

        return null;

        


    }
}