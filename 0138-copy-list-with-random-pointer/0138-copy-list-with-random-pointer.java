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
        
        HashMap<Node, Integer> hm = new HashMap<>();

        Node n=head;
        int idx=0;

        while(n!=null){
            hm.put(n,idx++);
            n=n.next;    
        }

        HashMap<Integer, Node> nhm = new HashMap<>();

        n=head;
        idx=0;
        Node prev=null;

        while(n!=null){

            Node nn;

            if(!nhm.containsKey(idx)){
                nn=new Node(n.val);
                nhm.put(idx,nn);
            }

            else{
                nn=nhm.get(idx);
            }

            if(idx>0){
                prev.next=nn;
            }

            if(n.random !=null){

                int ridx=hm.get(n.random);
                Node nrand=null;

                if(!nhm.containsKey(ridx)){
                    nrand=new Node(n.random.val);
                    nn.random=nrand;
                    nhm.put(ridx,nrand);
                }
                else{
                    nn.random=nhm.get(ridx);
                }
            }
            
            idx++;
            prev=nn;
            n=n.next;
        }

        return nhm.get(0);
    }
}