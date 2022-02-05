class Solution {
    public int findFinalValue(int[] a, int original) 
    {
        HashSet<Integer>hm=new HashSet<>();
        int n=a.length;
        
        for(int i=0;i<n;i++)
            hm.add(a[i]);
        
        while(hm.contains(original))
        {
            original=original*2;
        }
        return original;
    }
}