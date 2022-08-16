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
        
        HashMap<Node,Integer>hm=new HashMap<>();
        HashMap<Integer,Node>nm=new HashMap<>();
        
        int count=0;
        
        Node n=head;
        
        while(n!=null){
            hm.put(n,count);
            n=n.next;
            count++;
        }
        
        
        n=head;
        
        Node prev=null;
        
        while(n!=null){
            
            Node curr=n;
            Node crand=n.random;
            
            int cnpos=hm.get(curr);
            
            Node nn;
            
            if(nm.containsKey(cnpos)){
                nn=nm.get(cnpos);
            }
            
            else{
                nn=new Node(curr.val);
            }
            
            if(crand==null){
                nn.random=null;
            }
            
            else{
                
                int crpos=hm.get(crand);
                
                if(cnpos==crpos){
                    nn.random=nn;
                }
                
                else if(nm.containsKey(crpos)){
                    nn.random=nm.get(crpos);
                }

                else{ 
                    Node nrn=new Node(crand.val);
                    nn.random=nrn;
                    nm.put(crpos,nrn);
                }
            }
            
            if(prev!=null){
                prev.next=nn;
            }
            
            prev=nn;
            nm.put(cnpos,nn);
            n=n.next;
        }
        return nm.get(0);
    }
}