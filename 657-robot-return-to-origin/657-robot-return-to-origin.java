class Solution {
    public boolean judgeCircle(String moves) 
    {
        HashMap<Character,Integer>hm=new HashMap<>();
        
        for(int i=0;i<moves.length();i++)
        {
            char ch=moves.charAt(i);
            
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        
        
        int cu=hm.get('U')==null?0:hm.get('U');
        int cd=hm.get('D')==null?0:hm.get('D');
        int cl=hm.get('L')==null?0:hm.get('L');
        int cr=hm.get('R')==null?0:hm.get('R');
        
        if(cu==cd && cl==cr)
            return true;
        
        return false;
        
    }
}