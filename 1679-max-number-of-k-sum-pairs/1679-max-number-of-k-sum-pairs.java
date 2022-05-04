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
            
            if(a[i]==comp)
            {
                int freq=hm.get(a[i]);
                if(freq>1)
                {
                    count++;
                    hm.put(a[i],freq-2);
                }
            }
            else
            {
                if(hm.get(a[i])>0 && hm.containsKey(comp))
                {
                    int cFreq=hm.get(comp);
                    int freq=hm.get(a[i]);
                    
                    if(cFreq>0){
                        count++;
                        hm.put(a[i],freq-1);
                        hm.put(comp,cFreq-1);
                    }
                }
            }
        }
        return count;
    }
}