class Solution {
    public int findFinalValue(int[] a, int original) 
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int n=a.length;
        
        for(int i=0;i<n;i++)
            hm.put(a[i],i);
        
        while(hm.containsKey(original))
        {
            // if(!hm.containsKey(original))
            //     return original;
            
            original=original*2;
        }
        return original;
    }
}