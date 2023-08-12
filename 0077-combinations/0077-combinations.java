class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>res=new ArrayList<>();

        combinations(n,1,k,new ArrayList<>(),res);
        return res;
    }

    public void combinations(int n, int num, int k, List<Integer>list, List<List<Integer>>res){
        if(list.size()==k){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i=num;i<=n;i++){
            list.add(i);
            combinations(n,i+1,k,list,res);
            list.remove(list.size()-1);
        }
    }
}