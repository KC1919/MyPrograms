class Solution {
    public boolean judgeCircle(String moves) 
    {
        int ud=0 , rl=0;
        for(int i=0;i<moves.length();i++)
        {
            char ch=moves.charAt(i);
            
            if(ch=='U')
                ud++;
            
            else if(ch=='D')
                ud--;
            
            else if(ch=='L')
                rl--;
            
            else if(ch=='R')
                rl++;
        }
        if(ud==0 && rl==0)
            return true;
        
        return false;
        
    }
}