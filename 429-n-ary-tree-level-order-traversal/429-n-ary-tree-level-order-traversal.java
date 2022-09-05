/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        if(root==null){
            return new ArrayList<>();
        }
        
        List<List<Integer>>res=new ArrayList<>();
        
        Queue<Node>que=new LinkedList<>();
        
        que.add(root);
        int level=0;
        
        while(que.size()>0){
            
            level++;
            int size=que.size();
            
            while(size-->0){
                
                Node rem=que.remove();
                
                if(res.size()<level){
                    res.add(new ArrayList<>());
                }
                
                res.get(level-1).add(rem.val);
                
                for(Node child:rem.children){
                    que.add(child);
                }
            }
        }
        return res;
    }
}