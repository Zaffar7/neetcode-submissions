/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy= new ListNode(-1);
        dummy.next=head;
        ListNode temp=dummy;
        while(temp!=null){
            ListNode node= temp; //checking k node prsent
            for(int i=0;i<k && node!=null;i++){
                node=node.next;
            } 
            if(node==null) break;
            ListNode prev=null;
            ListNode curr=temp.next;
            for(int i=0;i<k;i++){
                //reverse logic
                ListNode n= curr.next;
                curr.next=prev;
                prev=curr;
                curr=n;
            }
            //update
            ListNode tail=temp.next;
            temp.next=prev;
            tail.next=curr;
            temp=tail;

        }
        return dummy.next;
    }
}
