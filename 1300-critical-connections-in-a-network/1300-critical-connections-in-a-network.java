class Solution {

    int time=0;

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        
        List<List<Integer>>graph=new ArrayList<>();

        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(List<Integer> list:connections){
            int src=list.get(0);
            int nbr=list.get(1);

            graph.get(src).add(nbr);
            graph.get(nbr).add(src);
        }

        boolean visited[]=new boolean[n];
        boolean ap[]=new boolean[n];
        int disc[]=new int[n];
        int parent[]=new int[n];
        int low[]=new int[n];
        time=0;

        List<List<Integer>>ans=new ArrayList<>();

        dfs(graph,visited,ap,disc,low,parent,0,ans);
        
        return ans;
    }

    public void dfs(List<List<Integer>> graph, boolean visited[], boolean ap[], int disc[], int low[], int parent[], int src, List<List<Integer>> ans){

        disc[src]=low[src]=time++;

        visited[src]=true;

        for(int nbr:graph.get(src)){

            if(nbr==parent[src]){
                continue;
            }

            else if(visited[nbr]==true){
                low[src]=Math.min(low[src],disc[nbr]);
            }

            else{
                parent[nbr]=src;
                dfs(graph,visited,ap,disc,low,parent,nbr,ans);

                low[src]=Math.min(low[src],low[nbr]);

                if(low[nbr]>disc[src]){
                    ap[src]=true;
                    List<Integer>list=new ArrayList<>();
                    list.add(src);
                    list.add(nbr);

                    ans.add(list);
                }
            }
        }
    }
}