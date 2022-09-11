class Solution {
    
    List<Integer>res;
    public List<Integer> eventualSafeNodes(int[][] graph) {
        
        int vtces=graph.length;
        boolean visited[]=new boolean[vtces];
        
        res=new ArrayList<>();
        
        Integer dp[]=new Integer[vtces];
        
        for(int i=0;i<vtces;i++){
            if(visited[i]==false){
                safeState(graph,i,visited,dp);
            }
        }
        
        Collections.sort(res);
        
        return res;
    }
    
    private boolean safeState(int graph[][], int src, boolean visited[], Integer dp[]){
        
        
        if(dp[src]!=null){
            return dp[src]==0?false:true;
        }
            
        visited[src]=true;
        
        int count=0;
        
        for(int e:graph[src]){
            if(visited[e]==false){
                boolean rres=safeState(graph,e,visited,dp);
                if(rres){
                    count++;
                }
            }
            
            else{
                return false;
            }
        }
        
        visited[src]=false;
        
        if(count==graph[src].length){
            res.add(src);
            dp[src]=1;
            return true;
        }
        
        dp[src]=0;
        return false;
    }
}