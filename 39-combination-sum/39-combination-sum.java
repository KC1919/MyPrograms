class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>>res=new ArrayList<>();
        
        combinations(candidates,0,0,target,new ArrayList<>(),res);
        return res;
    }
    
    public void combinations(int a[], int idx, int sum, int target, List<Integer>list, List<List<Integer>>res)
    {
        if(idx==a.length)
            return;
        
        if(sum==target){
            res.add(new ArrayList<>(list));
            return;
        }
        
        if(sum+a[idx]<=target){
            list.add(a[idx]);
            combinations(a,idx,sum+a[idx],target,list,res);
            list.remove(list.size()-1);
        }
        
        for(int i=idx+1;i<a.length;i++){
            if(sum+a[i]<=target){
                list.add(a[i]);
                combinations(a,i,sum+a[i],target,list,res);
                list.remove(list.size()-1);
            }
        }
    }
}