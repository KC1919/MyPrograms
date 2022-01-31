class Solution {
    public boolean validMountainArray(int[] a) 
    {
        int n=a.length;
        
        if(n==1)
            return false;
        if(n==2)
        {
            if(a[0]>=a[1])
                return false;
            return true;
        }
        int flag=0, lc=1, rc=0;
        
        for(int i=1;i<n;i++)
        {
            if(flag==0)
            {
                if(a[i-1]<a[i])
                {
                    lc++;
                    continue;   
                }
                else if(a[i]<a[i-1])
                {
                    rc++;
                    flag=1;
                }
                else
                    return false;
            }
            else if(flag==1)
            {
                if(a[i]<a[i-1])
                {
                    rc++;
                    continue;
                }
                else
                    return false;
            }
        }
        return (lc>1 && rc>=1)?true:false;
        
    }
}