class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) 
    {

        int slen=s.length();
        int ans[]=new int[slen];
        
        for(int i=0;i<slen;i++)
        {
            int count=0, flag=0;
            int x=startPos[1], y=startPos[0];
            for(int j=i;j<slen;j++)
            {
                if(s.charAt(j)=='U')y--;
                else if(s.charAt(j)=='D')y++;
                else if(s.charAt(j)=='L')x--;
                else if(s.charAt(j)=='R')x++;
                
                if(y==n || y<0 || x==n || x<0)
                {
                    ans[i]=count;
                    flag=1;
                    break;
                }
                else
                    count++;
            }
            if(flag==0)
                ans[i]=count;
        }
        return ans;
    }
}