class Solution {
    public List<List<Integer>> threeSum(int[] a) 
    {
        int n=a.length;
        Arrays.sort(a);
        
        List<List<Integer>>res=new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            if(i>0 && a[i]==a[i-1])
                continue;
            
            int comp=0-a[i];
            
            List<List<Integer>>list=twoSum(a,i+1,n-1,comp);
            
            for(int j=0;j<list.size();j++)
            {
                list.get(j).add(0,a[i]);
                res.add(list.get(j));
            }
        }
        return res;
    }
    
    public List<List<Integer>> twoSum(int a[], int l, int r, int target)
    {
        List<List<Integer>>res=new ArrayList<>();
        
        while(l<r)
        {
            if(a[l]+a[r]>target)
                r--;
            
            else if(a[l]+a[r]<target)
                l++;
            
            else
            {
                List<Integer>list=new ArrayList<>();
                list.add(a[l]);
                list.add(a[r]);
                res.add(list);
                
                l++;
                r--;
                
                while(l<a.length && a[l]==a[l-1])
                    l++;
                
                while(r>=0 && a[r]==a[r+1])
                    r--;
            }
        }
        
        return res;
    }
}