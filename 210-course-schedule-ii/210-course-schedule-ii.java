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
    
    Stack<Integer>st=new Stack<>();
    public int[] findOrder(int vtces, int[][] a) {
        
        ArrayList<Edge>graph[]=new ArrayList[vtces];
        
        for(int i=0;i<vtces;i++){
            graph[i]=new ArrayList<>();
        }
        
        for(int i=0;i<a.length;i++){
            int src=a[i][0];
            int nbr=a[i][1];
            
            graph[src].add(new Edge(src,nbr));
        }
        
        boolean visited[]=new boolean[vtces];
        boolean dfsvis[]=new boolean[vtces];
        
        for(int i=0;i<vtces;i++){
            if(visited[i]==false){
                if(detect(graph,i,visited,new boolean[vtces])){
                    return new int[0];
                }
            }
        }
        
        
        List<Integer>list=new ArrayList<>();
        
        while(st.size()>0){
            list.add(st.pop());
        }
        
        Collections.reverse(list);
        
        int res[]=new int[list.size()];
        int idx=0;
        
        for(int ele:list){
            res[idx++]=ele;
        }
        
        return res;
    }
    
    private boolean detect(ArrayList<Edge>graph[], int src, boolean visited[], boolean dfsvisit[])
    {
        
        visited[src]=true;
        dfsvisit[src]=true;
        
        for(Edge e:graph[src]){
            if(dfsvisit[e.nbr]==true && visited[e.nbr]==true){
                return true;
            }
            
            if(visited[e.nbr]==false){
                boolean res=detect(graph,e.nbr,visited,dfsvisit);    
                
                if(res==true){
                    return true;
                }
            }
        }
        
        st.push(src);
        dfsvisit[src]=false;
        
        return false;
    }
}