class Solution {
    public List<List<Integer>> combinationSum(int[] a, int target) 
    {
        List<List<Integer>>res=new ArrayList<>();
        combination(a,0,0,target,new ArrayList<>(),res);
        return res;
    }
    
    public void combination(int a[], int ind, int sum, int target, List<Integer>cand, List<List<Integer>>res)
    {
        if(sum>target)
            return;
        
        if(sum==target)
        {
            res.add(new ArrayList<>(cand));
            return;
        }
        
        if(sum<target)
        {
            cand.add(a[ind]);
            combination(a,ind,sum+a[ind],target,cand,res);
            cand.remove(cand.size()-1);
        }
        
        for(int i=ind+1;i<a.length;i++)
        {
            if(sum+a[i]<=target)
            {
                cand.add(a[i]);
                combination(a,i,sum+a[i],target,cand,res);
                cand.remove(cand.size()-1);
            }
        }
    }
}