class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        int n=graph.length;
        boolean visited[]=new boolean[n];
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        list.add(0);
        hasPath(graph,0,n-1,visited,res,list);
        return res;
    }
    
    private void hasPath(int graph[][], int src, int dst, boolean visited[],
        List<List<Integer>>res, List<Integer>list){
        
        if(src==dst){
            res.add(new ArrayList<>(list));
            return;
        }
        
        visited[src]=true;
        
        for(int nbr:graph[src]){
            
            if(visited[nbr]==false){
                list.add(nbr);
                hasPath(graph,nbr,dst,visited,res,list);
                list.remove(list.size()-1);
            }
        }
        
        visited[src]=false;
    }
}