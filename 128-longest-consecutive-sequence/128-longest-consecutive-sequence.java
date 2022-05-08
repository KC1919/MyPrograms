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
        for(Map.Entry<Integer,Integer>pair:hm.entrySet())
        {
            if(pair.getValue()==1)
            {
                int key=pair.getKey();
                int count=0;
                while(hm.containsKey(key+count))
                    count++;
                
                max=Math.max(count,max);
            }
        }
        return max;
    }
}