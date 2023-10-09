class Solution {
    public int longestConsecutive(int[] a) 
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int i=0;i<a.length;i++)
        {
            hm.put(a[i],i);
        }
        
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<a.length;i++)
        {
            if(hm.containsKey(a[i]-1))
                continue;
            
            else
            {
                int count=0;
                while(hm.containsKey(a[i]+count))
                {
                    count++;
                }
                max=Math.max(count,max);
            }
        }
        if(max<0)
            return 0;
        
        return max;
    }
}