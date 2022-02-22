class Solution {
    public int titleToNumber(String s) 
    {
        return calculate(s);
    }
    
    public int calculate(String s)
    {
        if(s.length()==1)
        {
            return s.charAt(0)-64;
        }
        
        int res=calculate(s.substring(1));
        res=(int)Math.pow(26,s.length()-1)*(s.charAt(0)-64)+res;
        return res;
    }
}