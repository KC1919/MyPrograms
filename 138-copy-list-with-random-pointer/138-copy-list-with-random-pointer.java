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

        HashMap < Node, Integer > hm = new HashMap < > ();
        hm.put(null, -1);

        Node n = head;
        int ind = 0;

        while (n != null) {
            hm.put(n, ind);
            n = n.next;
            ind++;
        }

        n = head;
        HashMap < Integer, Node > nhm = new HashMap < > ();

        Node dummy = new Node(-100000);
        Node p = dummy;

        while (n != null) {
            int idx = hm.get(n);
            Node nn = null;
            if (!nhm.containsKey(idx)) {
                nn = new Node(n.val);;
            }
            else{
                nn=nhm.get(idx);
            }

            int ridx = hm.get(n.random);

            if (ridx != -1) {
                
                if(ridx==idx){
                    nn.random=nn;
                }

                else if (nhm.containsKey(ridx)) {
                    nn.random = nhm.get(ridx);
                } 
                
                else {
                    Node rn = n.random;
                    nhm.put(ridx, new Node(rn.val));
                    nn.random = nhm.get(ridx);
                }
            } 
            
            else {
                nn.random = null;
            }
            
            p.next = nn;
            nhm.put(idx, nn);
            p = p.next;
            n = n.next;
        }
        return dummy.next;
    }
}