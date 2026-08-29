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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode dummy= head;
      while(dummy.next!=null){
        int x= dummy.val;
        int y= dummy.next.val;
        ListNode  temp= new ListNode(gcd(x,y));
        ListNode curr= dummy.next;
        temp.next=dummy.next;
        dummy.next=temp;
        dummy=curr;
        
      } 
      return head; 
    }
    int gcd(int a, int b){
         if (a == 0)
            return b;
        if (b == 0)
            return a;

        // Base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);
    }
}