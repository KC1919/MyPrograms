class Solution {
    public int findMaxConsecutiveOnes(int[] a) 
    {
        if(a.length==0)
            return 0;
        int k=0,count=0,max=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==1)
            {
                k=i;
                while(k<a.length&&a[i]==a[k])
                {
                    count++;
                    k++;
                }
                max=Math.max(max,count);
                i=k;
                count=0;
            }
        }
        return max;
        
    }
}