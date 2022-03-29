class Solution {
    public int findDuplicate(int[] a) 
    {
        int dup=0;
        for(int i=0;i<a.length;i++)
        {
            int abs=Math.abs(a[i]);
            
            if(a[abs-1]>0)
            {
                a[abs-1]=-a[abs-1];
            }
            else
                return abs;
        }
        return -1;
    }
}