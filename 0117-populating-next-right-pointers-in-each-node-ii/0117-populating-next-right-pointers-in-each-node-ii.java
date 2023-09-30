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

        while(que.size()>0){
            int size=que.size();

            while(size-->0){
                Node rem=que.remove();

                if(size>=1){
                    rem.next=que.peek();
                }

                if(rem.left!=null){
                    que.add(rem.left);
                }

                if(rem.right!=null){
                    que.add(rem.right);
                }
            }
        }
        return root;
    }
}