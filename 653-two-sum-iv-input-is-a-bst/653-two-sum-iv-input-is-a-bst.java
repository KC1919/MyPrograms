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
class Solution {
    
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
    public boolean findTarget(TreeNode root, int target) 
    {
       st=new Stack<>();
       rst=new Stack<>();
       
       st.push(new Pair(root,0));
       rst.push(new Pair(root,0));
       
       Pair left=getNextLeft();
       Pair right=getNextRight();
       
    //   System.out.println(left.data+","+right.data);
       
       while(left.node.val<right.node.val)
       {
           if((left.node.val+right.node.val)==target)
           return true;
           
           else if((left.node.val+right.node.val)<target)
           {
               left=getNextLeft();
           }
           else if((left.node.val+right.node.val)>target)
           {
               right=getNextRight();
           }
       }
       
       return false;
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
                if(top.node.right!=null)
                {
                    Pair p=new Pair(top.node.right,0);
                    rst.push(p);
                }
                top.state++;
            }
            
            else if(top.state==1)
            {
                if(top.node.left!=null)
                {
                    Pair p=new Pair(top.node.left,0);
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
}