class Solution {
    public boolean canFinish(int numCourses, int[][] preq) {

        int edges=preq.length;

        if(edges==0) return true;
        
        List<List<Integer>>graph=new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
    
        for(int i=0;i<edges;i++){
            int src=preq[i][0];
            int nbr=preq[i][1];
            graph.get(src).add(nbr);
        }

        boolean visited[]=new boolean[numCourses];
        boolean pathVisited[]=new boolean[numCourses];

        for(int i=0;i<edges;i++){
            boolean result=detectCycle(graph,preq[i][0],visited,pathVisited);
            if(!result) return false;
        }
        return true;
    }

    private boolean detectCycle(List<List<Integer>>graph, int src, boolean visited[], boolean pathVisited[]){
        
        visited[src]=true;

        pathVisited[src]=true;

        for(int nbr:graph.get(src)){
            if(visited[nbr]==false){
                boolean res=detectCycle(graph,nbr,visited,pathVisited);
                if(res==false) return false;
            }
            else if(visited[nbr]==true && pathVisited[nbr]==true){
                return false;
            }
        }
        
        pathVisited[src]=false;
        return true;
    }
}