class Solution {
    public List<List<Integer>> combinationSum2(int[] a, int target) {
        
        List<List<Integer>>res=new ArrayList<>();
        
        Arrays.sort(a);
        
        combinations(a,0,0,new ArrayList<>(),res,target);
        return res;
    }
    
    public void combinations(int a[], int idx, int sum, List<Integer>list, List<List<Integer>>res, int target)     
    {
        if(sum==target){
            res.add(new ArrayList<>(list));
            return;
        }
        
        if(idx>=a.length){
            return;
        }
        
        for(int i=idx;i<a.length;i++){
            
            if(i>0 && a[i]==a[i-1])
                continue;
            
            if(a[i]+sum<=target){
                list.add(a[i]);
                int val=a[i];
                a[i]-=30;
                combinations(a,i+1,sum+val,list,res,target);
                list.remove(list.size()-1);
                a[i]+=30;
            }
        }
    }
}