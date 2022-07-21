class Solution {
    public int longestConsecutive(int[] a) 
    {
        Set<Integer> hm=new HashSet<>();
        
        for(int i=0;i<a.length;i++){
            hm.add(a[i]);
        }
        
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<a.length;i++)
        {
            if(hm.contains(a[i]-1))
                continue;
            
            else
            {
                int count=0;
                while(hm.contains(a[i]+count)){
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