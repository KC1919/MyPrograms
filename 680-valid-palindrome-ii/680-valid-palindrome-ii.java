class Solution {
    public boolean validPalindrome(String s) {
        int i=0, j=s.length()-1;
        
        if(isPalin(s,i,j))
            return true;
        
        while(i<=j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                if(isPalin(s,i+1,j) || isPalin(s,i,j-1))
                    return true;
                
                else
                    return false;
            }
        }
        return true;
    }
    
    public boolean isPalin(String s, int left, int right)
    {
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