class Solution {
    public List<List<Integer>> fourSum(int[] a, int target) 
    {
        Arrays.sort(a);
        List<List<Integer>>res=new ArrayList<>();
        
        int n=a.length;
        
        for(int i=0;i<n;i++)
        {
            if(i!=0 && a[i]==a[i-1]) continue;
            
            for(int j=i+1;j<n;j++)
            {
                if(j!=i+1 && a[j]==a[j-1]) continue;
                
                int si=j+1, ei=n-1;
                
                while(si<ei)
                {
                    int sum=a[i]+a[j]+a[si]+a[ei];
                    
                    if(sum>target) ei--;
                    else if(sum<target) si++;
                    else
                    {
                        res.add(new ArrayList(Arrays.asList(a[i],a[j],a[si],a[ei])));
                        si++;
                        ei--;
                        
                        while(si<ei && a[si]==a[si-1])si++;
                        while(si<ei && a[ei]==a[ei+1])ei--;
                    }
                }
            }
        }
        
        return res;
        
    }
}