class Solution 
{
    public int maxOperations(int[] a, int k) 
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int n=a.length;
            
        for(int i=0;i<n;i++)
        {
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }
        
        int count=0;
        for(int i=0;i<n;i++)
        {
            int comp=k-a[i];
            
            if(hm.containsKey(comp))
            {
                int freq=hm.get(a[i]);
                int cfreq=hm.get(comp);
                
                if(a[i]==comp)
                {
                    if(freq>1)
                    {
                        count++;
                        hm.put(a[i],freq-2);
                    }
                }
                else
                {
                    if(freq>0 && cfreq>0)
                    {
                        count++;
                        hm.put(a[i],freq-1);
                        hm.put(comp,cfreq-1);
                    }
                }
            }
        }
        return count;
    }
}