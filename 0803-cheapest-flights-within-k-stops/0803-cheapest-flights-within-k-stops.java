class Solution {

    class Edge{
        int src;
        int cost;

        Edge(int nbr, int cost){
            this.src=nbr;
            this.cost=cost;
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        
        List<List<Edge>>graph=new ArrayList<>();

        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<flights.length;i++){

            int flight[]=flights[i];

            int sc=flight[0];
            int nb=flight[1];
            int cost=flight[2];

            graph.get(sc).add(new Edge(nb,cost));
        }

        Queue<Edge>que=new LinkedList<>();

        int ans[]=new int[n];

        Arrays.fill(ans,Integer.MAX_VALUE);

        que.add(new Edge(src,0));

        int steps=0;

        while(que.size()>0 && steps<=k){

            int size=que.size();

            while(size-->0){
                Edge rem=que.remove();

                for(Edge e:graph.get(rem.src)){

                    if(ans[e.src]>rem.cost+e.cost){
                        ans[e.src]=rem.cost+e.cost;
                        que.add(new Edge(e.src,rem.cost+e.cost));
                    }
                }
            }

            steps++;
        }

        return ans[dst]==Integer.MAX_VALUE?-1:ans[dst];
    }
}