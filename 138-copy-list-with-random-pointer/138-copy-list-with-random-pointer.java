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
        
        HashMap<Node,Integer>mm=new HashMap<>();
        
        Node thead=head;
        int ind=0;
        
        while(thead!=null){
            mm.put(thead,ind);
            ind++;
            thead=thead.next;
        }
        
        HashMap<Integer,Node>tm=new HashMap<>();
        
        Node n=head;
        
        Node dummy=new Node(Integer.MIN_VALUE);
        Node temp=dummy;
        
        int idx=0;
        
        
        while(n!=null){
            
            if(tm.containsKey(idx)){
                
                Node node=tm.get(idx);
                Node pnode=tm.get(idx-1);
                pnode.next=node;
                tm.put(idx-1,pnode);
                
                Node random=n.random;
                
                if(random!=null){
                    int randIdx=mm.get(random);
                    
                    if(tm.containsKey(randIdx))
                        node.random=tm.get(randIdx);
                    
                    else{
                        Node newRandNode=new Node(random.val);
                        tm.put(randIdx,newRandNode);
                        node.random=newRandNode;
                    }
                }
            }
            
            else{
                
                Node nn=new Node(n.val);
                Node random=n.random;
                
                if(random!=null){
                    int randIdx=mm.get(random);
                    
                    if(tm.containsKey(randIdx))
                        nn.random=tm.get(randIdx);
                    
                    else if(randIdx==idx)
                        nn.random=nn;
                    
                    else{
                        Node newRandNode=new Node(random.val);
                        tm.put(randIdx,newRandNode);
                        nn.random=newRandNode;
                    }
                }
                
                if(idx>0){
                    Node pnode=tm.get(idx-1);
                    pnode.next=nn;
                    tm.put(idx-1,pnode);
                }
                
                if(idx==0)
                    temp=nn;
                
                tm.put(idx,nn);
            }
            
            idx++;
            n=n.next;
        }
        return temp;
    }
}