class Solution {
    public boolean canFinish(int vtces, int[][] courses) {
        
        List<List<Integer>>graph=new ArrayList<>();
        
        for(int i=0;i<vtces;i++){
            graph.add(new ArrayList<>());
        }
        
        for(int i=0;i<courses.length;i++){
            int src=courses[i][0];
            int nbr=courses[i][1];
            
            graph.get(src).add(nbr);
        }
        
        boolean visited[]=new boolean[vtces];
        boolean dfsvis[]=new boolean[vtces];
        
        for(int i=0;i<vtces;i++){
            if(visited[i]==false){
                if(cycle(graph,i,visited,dfsvis)){
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean cycle(List<List<Integer>>graph, int src, boolean visited[], boolean dfsvis[]){
        
        visited[src]=true;
        dfsvis[src]=true;
        
        for(int nbr:graph.get(src)){
            if(visited[nbr]==true && dfsvis[nbr]==true){
                return true;
            }
            
            else if(visited[nbr]==false){
                if(cycle(graph,nbr,visited,dfsvis)){
                    return true;
                }
            }
        }
        
        dfsvis[src]=false;
        return false;
    }
}