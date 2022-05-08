class Solution {
    public int longestConsecutive(int[] a) {
        
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        for(int i=0;i<a.length;i++)
        {
            hm.put(a[i],0);
        }
        
        List<Integer>list=new ArrayList<>();
        
        for(int i=0;i<a.length;i++)
        {
            if(!hm.containsKey(a[i]-1)){
                // hm.put(a[i],1);
                list.add(a[i]);
            }
        }
        int max=0;
        for(int i=0;i<list.size();i++)
        {
            int ele=list.get(i);
            int count=0;
            
            while(hm.containsKey(ele+count))
                count++;
            
            max=Math.max(count,max);
        }
        return max;
    }
}