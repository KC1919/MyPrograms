class Solution {

    public int maximalNetworkRank(int n, int[][] roads) {
        
        List<List<Integer>>graph=new ArrayList<>();
        
        HashMap<Integer,HashSet<Integer>>hm=new HashMap<>();
        
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
            hm.put(i,new HashSet<>());
        }
        
        for(int i=0;i<roads.length;i++){
            
            int src=roads[i][0];
            int nbr=roads[i][1];
            
            graph.get(src).add(nbr);
            graph.get(nbr).add(src);
        
            hm.get(src).add(nbr);
            hm.get(nbr).add(src);
        }
        
        int max=0;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum=graph.get(i).size()+graph.get(j).size();
                
                if(hm.get(i).contains(j)){
                    sum--;
                }
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}