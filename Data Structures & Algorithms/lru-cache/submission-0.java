class LRUCache {
HashMap<Integer,Node>map= new HashMap<>();
int k;
Node head= new Node();
Node tail= new Node();
    public LRUCache(int capacity) {
        head.next=tail;
        tail.prev= head;
        k=capacity;
    }
    
    public int get(int key) {
        //prsent or not
        if(!map.containsKey(key)) return -1;
        else {
         int ans= map.get(key).val;
        Node temp= delete(head,map.get(key));
        add(head,tail,temp);
        return ans;   
        }
    }
    
    public void put(int key, int value) {
     Node res= map.get(key); // check already present
     if(res==null) {
        if(map.size()==k){
            //remove first from head then add before tail
         map.remove(head.next.key);
         delete(head,head.next);   
        }
        Node n= new Node();
        n.key=key;
        n.val=value;
        map.put(key,n);
        add(head,tail,n);

     }else{
        //present
        Node temp= delete(head,res);
        temp.val=value;
        map.put(key,temp);
        add(head,tail,temp);
     }   
    }
     public void add(Node H , Node T , Node n1){
        Node tm1 = T.prev;
          T.prev = n1;
        tm1.next = n1;
        n1.next = T; 
        n1.prev = tm1;
    }
    public Node delete(Node head , Node d){
        Node dm1 = d.prev;
        Node dp1 = d.next;
        
        dm1.next = dp1;
        dp1.prev = dm1;
        
        d.next = null;
        d.prev = null;
        
        return d;
    }

}
 class Node{
        int key=0;
        int val=0;
        Node prev = null;
        Node next = null;
        Node(){
        }
  }

