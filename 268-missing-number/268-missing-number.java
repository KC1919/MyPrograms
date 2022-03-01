class Solution {
    public int missingNumber(int[] a) 
    {
        int n=a.length;
        
        HashSet<Integer>hm=new HashSet<>();
        
        for(int e:a)
            hm.add(e);
        
        for(int i=0;i<=n;i++)
        {
            if(!hm.contains(i))
                return i;
        }
        
        return 0;
    }
}