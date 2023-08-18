class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        

        HashMap<Integer,HashSet<Integer>>graph=new HashMap<>();

        for(int i=0;i<n;i++){
            graph.put(i,new HashSet<>());
        }

        for(int i=0;i<roads.length;i++){
            int road[]=roads[i];

            graph.get(road[0]).add(road[1]);
            graph.get(road[1]).add(road[0]);
        }

        int max=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int c1=i;
                int c2=j;
                
                boolean flag=false;

                HashSet<Integer>hs=new HashSet<>();

                HashSet<Integer>city1=graph.get(c1);
                HashSet<Integer>city2=graph.get(c2);

                if(city1.contains(c2) || city2.contains(c1)){
                    flag=true;
                }

                int rank=city1.size()+city2.size();

                if(flag==true){
                    rank-=1;
                }

                max=Math.max(max,rank);
            }
        }

        return max;
    }
}