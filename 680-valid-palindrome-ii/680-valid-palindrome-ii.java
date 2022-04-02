class Solution {
    public boolean validPalindrome(String s) {
        
        if(isPalin(s))
            return true;
        
        int i=0, j=s.length()-1;
        
        while(i<=j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                if(isPalin(s.substring(i,j)) || isPalin(s.substring(i+1,j+1))==true)
                    return true;
                
                else
                    return false;
            }
        }
        return true;
    }
    
    public boolean isPalin(String s)
    {
        int left=0, right=s.length()-1;   
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
                return false;
            
            left++;
            right--;
        }
        return true;
    }
}