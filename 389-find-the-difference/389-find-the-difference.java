class Solution {
    public char findTheDifference(String s, String t) 
    {
        int sum=0;
        for(int i=0;i<s.length();i++)
            sum+=(s.charAt(i));
        
        int tsum=0;
        for(int i=0;i<t.length();i++)
            tsum+=(t.charAt(i));
        
        return (char)(tsum-sum);       
    }
}