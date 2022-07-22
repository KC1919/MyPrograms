class Solution {
    
    class Edge
    {
        int src;
        int nbr;
        
        Edge(int src, int nbr)
        {
            this.src=src;
            this.nbr=nbr;
        }
    }
    
    public boolean canFinish(int courses, int[][] edges) {
        
        
        ArrayList<Edge>graph[]=new ArrayList[courses];
        
        for(int i=0;i<courses;i++){
            graph[i]=new ArrayList<>();
        }
        
        for(int i=0;i<edges.length;i++){
            int src=edges[i][0];
            int nbr=edges[i][1];
            
            graph[src].add(new Edge(src,nbr));
        }
        
        boolean visited[]=new boolean[courses];
        boolean dfsvis[]=new boolean[courses];
        
        for(int i=0;i<courses;i++){
            if(visited[i]==false){
                boolean res=topologicalSort(graph,i,visited,dfsvis);
                if(res){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public boolean topologicalSort(ArrayList<Edge>graph[], int src, boolean visited[], boolean dfsvis[])
    {
        
        visited[src]=true;
        
        dfsvis[src]=true;
        
        for(Edge e:graph[src]){
            
            if(dfsvis[e.nbr]==true && visited[e.nbr]==true){
                return true;
            }
            
            if(visited[e.nbr]==false){
                boolean res=topologicalSort(graph,e.nbr,visited,dfsvis); 
                if(res){
                    return true;
                }
            }
        }
        
        dfsvis[src]=false;
        return false;
    }
}