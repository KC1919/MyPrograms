/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)
            return "";
        
        StringBuilder sb=new StringBuilder();
        preorder(root,sb);
        // System.out.println(sb.toString());
        return sb.toString();
    }
    
    public void preorder(TreeNode node, StringBuilder sb){
        if(node==null){
            sb.append("null ");
            return;
        }
        
        if(node!=null)
            sb.append(node.val+" ");
        
        preorder(node.left,sb);
        preorder(node.right,sb);
    }
    
    class Pair
    {
        TreeNode node;
        int state;
        Pair(TreeNode node, int state){
            this.node=node;
            this.state=state;
        }
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String s) {
        
        if(s.length()==0)
            return null;
        
        String a[]=s.split(" ");
        
        Stack<Pair>st=new Stack<>();
        
        int rootVal=Integer.parseInt(a[0]);
        TreeNode root=new TreeNode(rootVal);
        
        Pair p=new Pair(root,0);
        
        st.push(p);
        
        for(int i=1;i<a.length;i++){
            
            if(st.peek().state==0){
                
                st.peek().state++;
                
                if(!a[i].equals("null")){
                    int nodeVal=Integer.parseInt(a[i]);
                    TreeNode nn=new TreeNode(nodeVal);
                    st.peek().node.left=nn;
                    Pair np=new Pair(nn,0);
                    st.push(np);
                }
                else{
                    st.peek().node.left=null;
                }
            }
            
            else if(st.peek().state==1){
                
                st.peek().state++;
                
                if(!a[i].equals("null")){
                    int nodeVal=Integer.parseInt(a[i]);
                    TreeNode nn=new TreeNode(nodeVal);
                    st.peek().node.right=nn;
                    Pair np=new Pair(nn,0);
                    st.pop();
                    st.push(np);
                }
                else{
                    st.peek().node.right=null;
                    st.pop();
                }
            }
        }
        
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));