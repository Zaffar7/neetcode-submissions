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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode t1=l1;
    ListNode t2=l2;
    ListNode l3 = new ListNode(0);
    ListNode dummy= l3;
    int carry=0;
    int sum=0;
    while(t1!= null && t2 !=null){
         sum= t1.val+t2.val+ carry;
        l3.next=new ListNode (sum%10);
        carry = sum/10;
       l3=l3.next;
       t1=t1.next;
       t2=t2.next;
    }
    if(t1==null){
        while(t2!=null){
 sum= t2.val+ carry;
        l3.next= new ListNode(sum%10);
        carry = sum/10;
       l3=l3.next;
       t2=t2.next;
        }
    }
      if(t2==null){
        while(t1!=null){
 sum= t1.val+ carry;
        l3.next= new ListNode(sum%10);
        carry = sum/10;
       l3=l3.next;
       t1=t1.next;
        }
    }
    if(carry==1){
        l3.next=new ListNode(carry);
    }
        return dummy.next; 
    }
}
