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
    public ListNode mergeKLists(ListNode[] lists) {
return  Partition(0,lists.length-1,lists);
    }
    ListNode Partition(int s, int e, ListNode[]ls){
        if(s==e) return ls[s];
        int mid=(e+s)/2;
        if(s>e) return null;
            ListNode l1= Partition(s,mid,ls);
            ListNode l2=Partition(mid+1,e,ls);
             return mergeTwoSortedLists(l1, l2);
        
       
    }
    ListNode mergeTwoSortedLists(ListNode l1, ListNode l2) {

        if(l1 == null)
            return l2;

        if(l2 == null)
            return l1;

        if(l1.val <= l2.val) {
            l1.next = mergeTwoSortedLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoSortedLists(l1, l2.next);
            return l2;
        }

    }
}
