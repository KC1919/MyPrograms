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
        
        if(head==null)
            return head;
        
        Node n=head;
        Node forw=null;
        
        while(n!=null){
            
            forw=n.next;
            Node nn=new Node(n.val);
            nn.next=n.next;
            n.next=nn;
            n=forw;
        }
        
        n=head;
        forw=null;
        
        while(n!=null){
            
            forw=n.next.next;
            Node crand=n.random;
            
            if(crand==null)
                n.next.random=null;
            
            else
                n.next.random=crand.next;
            
            n=forw;
        }
        
        Node nhead=head.next;
        
        n=nhead;
        Node n1=head;
        
        while(n.next!=null){
            
            n1.next=n.next;
            n1=n1.next;
            
            n.next=n.next.next;
            n=n.next;
        }
        
        n1.next=n1.next.next;
        
        return nhead;
    }
}