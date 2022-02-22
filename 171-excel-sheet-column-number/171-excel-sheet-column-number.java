class Solution {
    public int titleToNumber(String s) 
    {
        return calculate(s,0);
    }
    
    public int calculate(String s, int ind)
    {
        if(ind==s.length()-1)
        {
            return s.charAt(ind)-64;
        }
        
        int res=calculate(s,ind+1);
        res=(int)Math.pow(26,s.length()-ind-1)*(s.charAt(ind)-64)+res;
        return res;
    }
}