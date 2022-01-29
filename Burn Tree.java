class Solution
{
    public static Node start;
    public static int minTime(Node root, int target) 
    {
        HashMap<Node,Node>hm=new HashMap<>();
        
        HashMap<Node,Boolean>visited=new HashMap<>();
        
        collectParents(root,null,hm,visited);
        start=null;
        find(root,target);
        
        Queue<Node>que=new LinkedList<>();
        
        que.add(start);
        
        int time=0;
        
        while(que.size()>0)
        {
            int size=que.size();
            int flag=0;
            
            while(size-->0)
            {
                Node rem=que.remove();
                
                visited.put(rem,true);
                
                if(rem.left!=null && visited.get(rem.left)!=true)
                {
                    que.add(rem.left);
                    visited.put(rem.left,true);
                    flag=1;
                }
                
                if(rem.right!=null && visited.get(rem.right)!=true)
                {
                    que.add(rem.right);
                    visited.put(rem.right,true);
                    flag=1;
                }
                
                if(hm.containsKey(rem))
                {
                    Node parent=hm.get(rem);
                    if(visited.get(parent)!=true)
                    {
                        que.add(parent);
                        visited.put(parent,true);
                        flag=1;
                    }
                }
            }
            if(flag==1)
            time+=1;
        }
        return time;
    }
    
    public static void find(Node node, int target)
    {
        if(node==null)
        return;
        
        if(node.data==target)
        {
            start=node;
            return;
        }
        
        find(node.left,target);
        find(node.right,target);
        
        return;
    }
    public static void collectParents(Node node, Node parent, HashMap<Node,Node>hm,HashMap<Node,Boolean>visited)
    {
        if(node==null)
            return;
            
        visited.put(node,false);
        
        if(parent!=null)
        {
            hm.put(node,parent);
        }
        
        collectParents(node.left,node,hm,visited);
        collectParents(node.right,node,hm,visited);
    }
}
