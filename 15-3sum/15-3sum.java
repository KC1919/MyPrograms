class Solution 
{
    public List<List<Integer>> threeSum(int[] a) 
    {
        Arrays.sort(a);
        
        List<List<Integer>>ans=new ArrayList<>();
        
        for(int i=0;i<a.length;i++)
        {
            if(i!=0 && a[i]==a[i-1])
                continue;
            
            List<List<Integer>>res=twoSum(a,i+1,a.length-1,0-a[i]);
            
            for(int j=0;j<res.size();j++)
            {
                res.get(j).add(0,a[i]);
                ans.add(res.get(j));
            }
        }
        return ans;
    }
    
    public List<List<Integer>> twoSum(int a[], int si, int ei, int target)
    {
        List<List<Integer>>res=new ArrayList<>();
        while(si<ei)
        {
            int sum=a[si]+a[ei];
            
            if(sum>target)
                ei--;
            
            else if(sum<target)
                si++;
            
            else
            {
                res.add(new ArrayList<>(Arrays.asList(a[si],a[ei])));
                si++;
                ei--;
                
                while(si<ei && a[si]==a[si-1])si++;
                while(ei>si && a[ei]==a[ei+1])ei--;
            }
        }
        return res;
    }
}