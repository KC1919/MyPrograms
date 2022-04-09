class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        
        int nodes=graph.length;
        HashSet<Integer>hm=new HashSet<>();
        Integer dp[]=new Integer[nodes];
        
        for(int i=0;i<graph.length;i++){
            if(graph[i].length==0){
                hm.add(i);
                dp[i]=1;
            }
        }
        
        boolean visited[]=new boolean[nodes];
        
        for(int i=0;i<nodes;i++)
        {
            if(!hm.contains(i) && dp[i]==null){
                boolean res=travelGraph(graph,i,visited,dp,hm);
                dp[i]=res==false?0:1;
            }
        }
        List<Integer>list=new ArrayList<>();
        
        for(int i=0;i<nodes;i++)
        {
            if(dp[i]==1)
                list.add(i);
        }
        
        return list;
    }
    
    public boolean travelGraph(int graph[][], int src, boolean visited[], Integer dp[], HashSet<Integer>hm)
    {
        if(hm.contains(src))
            return true;
        
        if(dp[src]!=null){
            if(dp[src]==0)
                return false;
            
            return true;
        }
            
        visited[src]=true;
        
        boolean myRes=true;
        
        int flag=0;
        
        for(int e:graph[src])
        {
            if(visited[e]==true)
                return false;
                
            else if(visited[e]==false)
            {
                boolean res=travelGraph(graph,e,visited,dp,hm);
                myRes=res&myRes;
                
                flag=1;
            }
        }
        
        if(flag==0)
            myRes=false;
        
        dp[src]=myRes==false?0:1;
        visited[src]=false;
        return myRes;
    }
}