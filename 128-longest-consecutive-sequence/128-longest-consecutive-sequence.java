class Solution {
    public int longestConsecutive(int[] a) {
        
        HashSet<Integer>hm=new HashSet<>();
        
        for(int i=0;i<a.length;i++)
            hm.add(a[i]);
        
        int max=0;
        for(int ele:hm)
        {
            if(!hm.contains(ele-1))
            {
                int count=0;
                while(hm.contains(ele+count))
                    count++;
                
                max=Math.max(count,max);
            }
        }
        return max;
    }
}