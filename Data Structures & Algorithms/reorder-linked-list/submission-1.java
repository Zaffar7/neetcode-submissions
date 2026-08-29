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
    public void reorderList(ListNode head) {
        ListNode slow= head;
        ListNode fast =head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

      ListNode second=  reverse(slow.next);
      slow.next=null;
      ListNode first=head;
      while(second !=null){ListNode p1=first.next; ListNode p2=second.next;
        first.next= second;
        second.next=p1;
        first=p1;
        second=p2;
      }
      
    }
    ListNode reverse(ListNode node){
        ListNode curr=null;
        while(node!=null){
            ListNode temp= node;
            node=node.next;
             temp.next=curr;
             curr=temp;
        } 
        return curr;
    }
}
