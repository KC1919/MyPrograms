class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();

        permutations(nums,0,new ArrayList<>(),res, new boolean[nums.length]);
        return res;
    }

    public void permutations(int a[], int idx, List<Integer>list, List<List<Integer>>res, boolean vis[]){

        if(list.size()==a.length){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<a.length;i++){
            if(vis[i]==false){
                vis[i]=true;
                list.add(a[i]);
                permutations(a,i+1,list,res,vis);
                list.remove(list.size()-1);
                vis[i]=false;
            }
        }
    }
}