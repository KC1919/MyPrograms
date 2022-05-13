/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        if(root==null)
            return root;
        
        Queue<Node>que=new LinkedList<>();
        
        que.add(root);
        
        //level-order traversal
        while(que.size()>0){
            
            //taking the current size of the queue, that tells the number of eleemnt in the
            //current level, that is going to be processed, so that we only
            //process those elements
            int size=que.size();
            
            //process all the nodes of current level
            while(size-->0){
                
                //take out a node of the current level one by one
                Node rem=que.remove();
                
                //then check if there are any nodes left in the queue of the current level
                //if left then the current element next pointer will point to the
                //node in the queue
                if(size>=1){
                    rem.next=que.peek();
                }
                
                //then we add the children of the removed node in the que
                if(rem.left!=null)
                    que.add(rem.left);
                
                if(rem.right!=null)
                    que.add(rem.right);
            }
        }
        return root;
    }
}