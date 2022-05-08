class Solution {
    public int longestConsecutive(int[] a) {
        
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        for(int i=0;i<a.length;i++)
        {
            hm.put(a[i],0);
        }
        
        for(int i=0;i<a.length;i++)
        {
            if(!hm.containsKey(a[i]-1)){
                hm.put(a[i],1);
            }
        }
        
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            if(hm.get(a[i])==1)
            {
                int count=0;
                while(hm.containsKey(a[i]+count))
                    count++;
                
                max=Math.max(count,max);
            }
        }
        return max;
    }
}