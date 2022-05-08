class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(Character.isDigit(ch) || (ch>=97 && ch<=122))
                sb.append(ch);
            
            else if(ch>=65 && ch<=90){
                sb.append(Character.toLowerCase(ch));
            }
        }
        
        int left=0, right=sb.length()-1;
        
        while(left<right)
        {
            if(sb.charAt(left)!=sb.charAt(right))
                return false;
            
            left++;
            right--;
        }
        return true;
    }
}