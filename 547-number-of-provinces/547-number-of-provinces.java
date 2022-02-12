class Solution 
{
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
    
    public int findCircleNum(int[][] a) 
    {
        int n=a.length;
        
        ArrayList<Edge>graph[]=new ArrayList[n+1];
        
        for(int i=1;i<=n;i++)
        {
            graph[i]=new ArrayList<>();
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]==1 && i!=j)
                graph[i+1].add(new Edge(i+1,j+1));
            }
        }
        
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        
        boolean visited[]=new boolean[n+1];
        
        for(int i=1;i<=n;i++)
        {
            if(visited[i]==false)
            {
                ArrayList<Integer>list=new ArrayList<>();
                component(graph,i,visited,list);
                if(list.size()>0)
                    res.add(list);
            }
        }
        return res.size();
    }
    
    public void component(ArrayList<Edge>graph[], int src, boolean visited[], ArrayList<Integer>comp)
    {
        if(visited[src]==true)
            return;
        
        visited[src]=true;
        comp.add(src);
        
        for(Edge e:graph[src])
        {
            if(visited[e.nbr]==false)
                component(graph,e.nbr,visited,comp);
        }
    }
}