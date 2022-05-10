class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>>res=new ArrayList<>();
        combinationSum(k,1,n,new ArrayList<>(),res,0);
        return res;
    }
    
    public void combinationSum(int k, int num, int target, List<Integer>list, List<List<Integer>>res, int sum)
    {
        if(list.size()>k)
            return;
        
        else if(list.size()==k && sum==target){
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=num;i<=9;i++)
        {
            if(sum+i<=target){
                list.add(i);
                combinationSum(k,i+1,target,list,res,sum+i);
                list.remove(list.size()-1);
            }
        }
    }
}