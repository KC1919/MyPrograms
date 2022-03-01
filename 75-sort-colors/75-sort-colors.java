class Solution {
    public void sortColors(int[] a) 
    {
        int rc=0, wc=0, bc=0;
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
                rc++;
            else if(a[i]==1)
                wc++;
            else
                bc++;
        }
        
        int k=0;
        while(rc-->0)
        {
            a[k++]=0;
        }
        while(wc-->0)
        {
            a[k++]=1;
        }
        while(bc-->0)
        {
            a[k++]=2;
        }
    }
}