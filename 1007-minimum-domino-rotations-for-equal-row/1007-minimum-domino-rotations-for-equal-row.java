class Solution {
    public int minDominoRotations(int[] top, int[] bot) 
    {
        int a=top[0];
        int b=bot[0];
        
        int ca=1;
        int cb=1;
        
        for(int i=1;i<top.length;i++)
        {
            if(top[i]==a || bot[i]==a)
                ca++;
            
            if(top[i]==b || bot[i]==b)
                cb++;
        }
        
        int cand=-1;
        
        //whichever candidates count is greater, that is selected as
        //the potential candidate
        
        if(ca>=top.length)
            cand=a;
        
        else if(cb>=top.length)
            cand=b;
        
        if(cand==-1)
            return cand;
        
        int tc=0;
        int bc=0;
        
        //Loop to check at how many places the candidate is not present
        for(int i=0;i<top.length;i++)
        {
            if(top[i]!=cand)
                tc++;
            
            else if(bot[i]!=cand)
                bc++;
        }
        
        //so we count the places int top array and the bottom array
        //and we return minimum of the two, since we have to tell the minimum domino
        //rotation(swapping)
        
        return Math.min(tc,bc);
    }
}