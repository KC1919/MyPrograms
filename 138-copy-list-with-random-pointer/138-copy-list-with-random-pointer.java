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
        
        Node prev=null;
        
        int idx=0;
        
        
        while(n!=null){
            
            Node node=null;
            
            if(tm.containsKey(idx))
                node=tm.get(idx);
            
            else
                node=new Node(n.val);
            
            Node random=n.random;
                
            if(random!=null){
                int randIdx=mm.get(random);
                
                if(randIdx==idx)
                    node.random=node;
                
                else if(tm.containsKey(randIdx))
                    node.random=tm.get(randIdx);
                    
                else{
                    Node newRandNode=new Node(random.val);
                    node.random=newRandNode;
                    tm.put(randIdx,newRandNode);
                }
            }
            
            if(idx==0){
                prev=node;
                temp=node;
            }
            else{
                prev.next=node;
                prev=prev.next;
            }
            tm.put(idx,node);
            idx++;
            n=n.next;
        }
        return temp;
    }
}