class Solution {
    public int removePalindromeSub(String s) {
        
        if(s.length()==0)
            return 0;
        
        else if(s.length()==1 || palindrome(s))
            return 1;
        
        int a=0,b=0;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='a')
                a++;
            
            else
                b++;
        }
        
        if(a>0 && b>0)
            return 2;
        
        else
            return 1;
    }
    
    private boolean palindrome(String s){
        
        int l=0, r=s.length()-1;
        
        while(l<r){
            
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        
        return true;
    }
}