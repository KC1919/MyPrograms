class Solution {
    public int longestOnes(int[] a, int k) {
        int zc=0, max=0, count=0;
        int j=0;
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==1)
            {
                count++;
                max=Math.max(max,count);
            }
            else if(a[i]==0)
            {
                if(k>0)
                {
                    count++;
                    zc++;

                    while(j<i && zc>k)
                    {
                        if(a[j]==0){
                            zc--;
                        }
                        count--;
                        j++;
                    }

                    max=Math.max(max,count);
                }
                else
                {
                    count=0;
                    max=Math.max(max,count);
                }
            }
        }
        return max;
        
    }
}