class Solution {
    public boolean judgeCircle(String moves) 
    {
        int cu=0, cd=0, cl=0, cr=0;
        for(int i=0;i<moves.length();i++)
        {
            char ch=moves.charAt(i);
            
            if(ch=='U')
                cu+=1;
            
            else if(ch=='D')
                cd+=1;
            
            else if(ch=='L')
                cl+=1;
            
            else if(ch=='R')
                cr+=1;
        }
        if(cr==cl && cd==cu)
            return true;
        
        return false;
        
    }
}