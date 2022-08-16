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
            
            //curr node
            Node curr=n;
            
            //curr random node
            Node crand=n.random;
            
            //curr node position
            int cnpos=hm.get(curr);
            
            //new node
            Node nn;
            
            if(nm.containsKey(cnpos))
                nn=nm.get(cnpos);
            
            else
                nn=new Node(curr.val);
            
            if(crand==null)
                nn.random=null;
            
            else{
                
                //curr random node position
                int crpos=hm.get(crand);
                
                //if curr rand node pos is same as curr node pos
                //that means the random pointer of curr node points to itself
                if(cnpos==crpos)
                    nn.random=nn;
                
                //check if random node is present in the new list of nodes
                else if(nm.containsKey(crpos))
                    nn.random=nm.get(crpos);

                //if not present create new random node of the curr new node
                //and put it int the hasmap of new nodes after attaching the new random
                //to the currr new node
                else{ 
                    Node nrn=new Node(crand.val);
                    nn.random=nrn;
                    nm.put(crpos,nrn);
                }
            }
            
            if(prev!=null)
                prev.next=nn;
            
            prev=nn;
            nm.put(cnpos,nn);
            n=n.next;
        }
        return nm.get(0);
    }
}