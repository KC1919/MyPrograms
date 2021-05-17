import java.util.*;
class Pairs
{
    static Scanner sc=new Scanner(System.in);
    
    public static class Node
    {
        Node left;
        Node right;
        int data;
    }
    
    public static class Pair
    {
        int state;
        Node node;
        
        public Pair(Node node,int state)
        {
            this.node=node;
            this.state=state;
        }
    }
    
    static void findPair(Node node,int target) //Time Complexity  O(N) , Space complexity O(Log n)
    {
        Stack<Pair>ls=new Stack<>();
        Stack<Pair>rs=new Stack<>();
        
        ls.push(new Pair(node,0));
        rs.push(new Pair(node,0));
        
        Node left=retLefIno(ls);
        Node right=retRitIno(rs);
        
        while(left.data<right.data)
        {
            if(left.data + right.data < target)
            {
                left=retLefIno(ls);
            }
            else if(left.data + right.data > target)
            {
                right=retRitIno(rs);
            }
            else
            {
                System.out.println("Pair: "+left.data+" , "+right.data);
                left=retLefIno(ls);
                right=retRitIno(rs);
            }
        }
    }
    
    static Node retLefIno(Stack<Pair>st)
    {
        
        while(st.size()!=0)
        {
            if(st.peek().state==0)
            {
                st.peek().state++;
                
                if(st.peek().node.left!=null)
                {
                    st.push(new Pair(st.peek().node.left,0));
                }
                
            }
            
            else if(st.peek().state==1)
            {
                st.peek().state++;
                
                if(st.peek().node.right!=null)
                {
                    st.push(new Pair(st.peek().node.right,0));
                }
                
                return st.peek().node;
            }
            
            else
            {
                st.pop();
            }
        }
        return null;
    }
    
    static Node retRitIno(Stack<Pair>st)
    {
        
        while(st.size()!=0)
        {
            if(st.peek().state==0)
            {
                st.peek().state++;
                
                if(st.peek().node.right!=null)
                {
                    st.push(new Pair(st.peek().node.right,0));
                }
                
            }
            
            else if(st.peek().state==1)
            {
                st.peek().state++;
                
                if(st.peek().node.left!=null)
                {
                    st.push(new Pair(st.peek().node.left,0));
                }
                
                return st.peek().node;
            }
            
            else
            {
                st.pop();
            }
        }
        return null;
    }
}