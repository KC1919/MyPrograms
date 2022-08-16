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
        
        HashMap<Node, Node>hm=new HashMap<>();
        
        Node n=head;
        
        Node nhead=null, prev=null;
        
        while(n!=null){
            Node nn=new Node(n.val);
            
            if(nhead==null){
                nhead=nn;
            }
            
            if(prev!=null){
                prev.next=nn;
            }
            
            prev=nn;
            hm.put(n,nn);
            n=n.next;
        }
        
        n=head;
        
        while(n!=null){
            
            Node curr=n;
            Node copy=hm.get(curr);
            
            if(curr.random==null){
                copy.random=null;
            }
            
            else{
                copy.random=hm.get(curr.random);
            }
            
            n=n.next;
        }
        
        return nhead;
    }
}