class Solution {
    public int[] twoSum(int[] a, int target) 
    {
        int n=a.length;
        
        int ans[]=new int[2];
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        ans[0]=-1;
        ans[1]=-1;
        
        for(int i=0;i<n;i++)
        {
            if(hm.size()>0 && hm.containsKey(target-a[i]))
            {
                ans[0]=i;
                ans[1]=hm.get(target-a[i]);
                return ans;
            }
            hm.put(a[i],i);
            
        }
        return ans;
    }
}