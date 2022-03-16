class Solution {
    public int[] topKFrequent(int[] a, int k) 
    {
        int n=a.length;
        
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        for(int i=0;i<n;i++)
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        
        
        List<List<Integer>>list=new ArrayList<>();
        
        for(int i=0;i<=n;i++)
        {
            list.add(new ArrayList<>());
        }
        
        int ans[]=new int[k];
        
        for(Map.Entry<Integer,Integer>pair:hm.entrySet())
        {
            list.get(pair.getValue()).add(pair.getKey());
        }
        
        int p=0;
        for(int i=n;i>=0;i--)
        {
            for(int ele:list.get(i))
            {
                ans[p++]=ele;
                k--;
                if(k==0)
                    return ans;
            }
        }
        
        return ans;
    }
}