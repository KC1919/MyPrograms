class Solution {
    public int longestOnes(int[] a, int k) {
        
        int zc=0, max=0, count=0;
        int j=0;
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==1){
                count++;
                max=Math.max(max,count);
            }
    
            else if(a[i]==0)
            {
                if(k>0) //checking if we can flip 0's or not
                {
                    count++;
                    zc++;

                    while(j<i && zc>k)  //if the nummber of flipped 0's exceeds the
                    {                   //flip limit, then we start removing element
                        if(a[j]==0)     //from start of subarray till the count of 0's
                            zc--;       //come in range of the limit
            
                        count--;
                        j++;
                    }
                    max=Math.max(max,count);
                }
                else
                    count=0;
            }
        }
        return max;
        
    }
}