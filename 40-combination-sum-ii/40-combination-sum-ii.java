class Solution {
    public List<List<Integer>> combinationSum2(int[] a, int target) 
    {
        List<List<Integer>>res=new ArrayList<>();
        
        List<Integer>list=new ArrayList<>();
        
        Arrays.sort(a);
        
        for(int i=0;i<a.length;i++)
        {
            if(i>0 && a[i]==a[i-1])
                continue;
            
            else
                combinations(a,i,0,target,list,res);
        }
        
        return res;
    }
    
    public void combinations(int a[], int idx, int sum, int target, List<Integer>list, List<List<Integer>>res)
    {
        if(idx==a.length || sum==target)
        {
            if(sum==target)
            {
                if(!res.contains(list))
                    res.add(new ArrayList<>(list));
            }
            return;
        }
        
        for(int i=idx;i<a.length;i++)
        {
            if(i>idx && a[i]==a[i-1])
                continue;
            
            else if(sum+a[i]<=target)
            {
                list.add(a[i]);
                combinations(a,i+1,sum+a[i],target,list,res);
                list.remove(list.size()-1);
            }
            else
                break;
        }
    }
}