class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb=new StringBuilder();
        
        //firstly iterate through the whole string
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            //append only alphanumeric characters
            if(Character.isDigit(ch) || (ch>=97 && ch<=122))
                sb.append(ch);
            
            //append only alphanumeric characters,if capital convert them to small then append
            else if(ch>=65 && ch<=90){
                sb.append(Character.toLowerCase(ch));
            }
        }
        
        int left=0, right=sb.length()-1;
        
        //check for palindrom
        while(left<right)
        {
            if(sb.charAt(left)!=sb.charAt(right)) //if any character mismatch
                return false;    //return false, means not palindrome
            
            left++;
            right--;
        }
        return true;  //is palindrome
    }
}