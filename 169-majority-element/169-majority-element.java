class Solution {
    public int majorityElement(int[] a) 
    {
        int cand=0;
        int count=0;
        
        for(int i=0;i<a.length;i++)
        {
            if(count==0)
            {
                cand=a[i];
                count=0;
            }
            if(a[i]==cand)
                count++;
            
            else
            {
                count--;
            }
        }
        return cand;
    }
}