/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    class Pair
    {
        int state=0;
        TreeNode node;
        
        Pair(TreeNode node, int state)
        {
            this.node=node;
            this.state=state;
        }
    }
    
    public Stack<Pair>st;
    public Stack<Pair>rst;
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) 
    {
//         ArrayList<Integer>list1=new ArrayList<>();
//         ArrayList<Integer>list2=new ArrayList<>();
        
//         traverse(root1,list1);
//         traverse(root2,list2);
        
        // int i=0, j=0;
        ArrayList<Integer>ans=new ArrayList<>();
        
        st=new Stack<>();
        rst=new Stack<>();
        
        if(root1!=null)
        st.push(new Pair(root1,0));
        
        if(root2!=null)
        rst.push(new Pair(root2,0));
        
        Pair left=getNextLeft();
        Pair right=getNextRight();
        
        
        while(st.size()!=0 && rst.size()!=0)
        {
            if(left.node.val<=right.node.val)
            {
                ans.add(left.node.val);
                left=getNextLeft();
            }
            else if(left.node.val>right.node.val)
            {
                ans.add(right.node.val);
                right=getNextRight();
            }
        }
        
        while(st.size()!=0)
        {
            ans.add(left.node.val);
            left=getNextLeft();
        }
        
        while(rst.size()!=0)
        {
            ans.add(right.node.val);
            right=getNextRight();
        }
        
        return ans;
    }
    
    public Pair getNextLeft()
    {
        while(st.size()>0)
        {
            Pair top=st.peek();
            
            if(top.state==0)
            {
                if(top.node.left!=null)
                {
                    Pair p=new Pair(top.node.left,0);
                    st.push(p);
                }
                top.state++;
            }
            
            else if(top.state==1)
            {
                if(top.node.right!=null)
                {
                    Pair p=new Pair(top.node.right,0);
                    st.push(p);
                }
                top.state++;
                return top;
            }
            
            else
            {
                st.pop();
            }
            
        }
        return null;
    }
    
    public Pair getNextRight()
    {
        while(rst.size()>0)
        {
            Pair top=rst.peek();
            
            if(top.state==0)
            {
                if(top.node.left!=null)
                {
                    Pair p=new Pair(top.node.left,0);
                    rst.push(p);
                }
                top.state++;
            }
            
            else if(top.state==1)
            {
                if(top.node.right!=null)
                {
                    Pair p=new Pair(top.node.right,0);
                    rst.push(p);
                }
                top.state++;
                return top;
            }
            
            else
            {
                rst.pop();
            }
            
        }
        return null;
    }
    
//     public void traverse(TreeNode node, ArrayList<Integer>list)
//     {
//         if(node==null)
//             return;
        
//         traverse(node.left,list);
//         list.add(node.val);
//         traverse(node.right,list);
//     }
}