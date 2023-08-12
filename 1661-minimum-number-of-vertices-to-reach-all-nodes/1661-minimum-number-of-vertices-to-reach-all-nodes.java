class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        HashSet<Integer>hm=new HashSet<>();
        
        for(int i=0;i<edges.size();i++){

            int s=edges.get(i).get(0);
            int nb=edges.get(i).get(1);

            hm.add(nb);
        }

        List<Integer>list=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(hm.contains(i)){
                continue;
            }
            else{
                list.add(i);
            }
        }

        return list;
    }
}