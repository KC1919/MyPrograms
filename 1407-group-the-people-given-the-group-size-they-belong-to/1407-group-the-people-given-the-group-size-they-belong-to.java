class Solution {
    public List<List<Integer>> groupThePeople(int[] sizes) {
        
        HashMap<Integer,Integer>hm=new HashMap<>();

        List<List<Integer>>res=new ArrayList<>();

        for(int i=0;i<sizes.length;i++){

            int group=sizes[i];

            if(hm.containsKey(group)){
                int idx=hm.get(group);

                if(res.get(idx).size()==group){
                    List<Integer>ng=new ArrayList<>();
                    ng.add(i);
                    res.add(ng);
                    hm.put(group,res.size()-1);
                }
                else{
                    res.get(idx).add(i);
                }
            }
            else{
                List<Integer>ng=new ArrayList<>();
                ng.add(i);
                res.add(ng);
                hm.put(group,res.size()-1);
            }
        }
        return res;
    }
}