/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> copy= new HashMap<>();
        copy.put(null,null);
        Node curr = head;
        while(curr!=null){
          
            Node cop =new Node(curr.val);
            copy.put(curr,cop);  curr=curr.next;
        }
        curr=head;
        while(curr!=null){
            Node cop= copy.get(curr);
            cop.next=copy.get(curr.next);
            cop.random= copy.get(curr.random);
            curr=curr.next;
        }
        return copy.get(head);

    }
}
