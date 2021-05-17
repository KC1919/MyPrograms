import java.util.*;
class connComp
{
    static public class Edge
    {
        int src;
        int nbr;
        int wt;
        
        Edge(int src,int nbr,int wt)
        {
            this.src=src;
            this.nbr=nbr;
            this.wt=wt;
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter no. of vertices: ");
        int vtces=sc.nextInt();
        
        System.out.println("enter no. of edges: ");
        int edges=sc.nextInt();
        
        ArrayList<Edge> graph[]=new ArrayList[vtces];
        
        for(int i=0;i<vtces;i++)
        {
            graph[i]=new ArrayList<Edge>();
        }
        
        System.out.println("enter edges: 'In the form: source neighbour weight'");
        
        for(int i=0;i<edges;i++)
        {
            String edge[]=sc.next().split(",");
            int src=Integer.parseInt(edge[0]);
            int nbr=Integer.parseInt(edge[1]);
            int wt=Integer.parseInt(edge[2]);
            graph[src].add(new Edge(src,nbr,wt));
            graph[nbr].add(new Edge(nbr,src,wt));
        }
         
        System.out.println("The graph is: ");
        for(int i=0;i<graph.length;i++)
        {
            for(Edge edge:graph[i])
            {
                System.out.print(edge.src+"->"+edge.nbr+" ,");
            }
            System.out.println();
        }
        
        boolean visited[]=new boolean[vtces];
        ArrayList<ArrayList<Integer>>comps=new ArrayList<>();
        
        for(int i=0;i<vtces;i++)
        {
            if(visited[i]==false)
            {
                ArrayList<Integer>comp=new ArrayList<>();
                connectComponent(graph,i,visited,comp);
                comps.add(comp);
            }
        }
        
        System.out.println("the connected componets are: ");
        for(int i=0;i<comps.size();i++)
        {
            System.out.println(comps.get(i));
        }
    }
    
    static void connectComponent(ArrayList<Edge>graph[], int src, boolean visited[],ArrayList<Integer>comp)
    {
        visited[src]=true;
        comp.add(src);
        
        for(Edge edge:graph[src])
        {
            if(visited[edge.nbr]==false)
            {
                connectComponent(graph,edge.nbr,visited,comp);
            }
        }
    }
}
        