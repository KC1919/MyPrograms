class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if((ch>=65 && ch<=90) || (ch>=97 && ch<=122) || (ch>='0' && ch<='9')){
                sb.append(Character.toLowerCase(ch));
            }
        }

        // String str=sb.toString().toLowerCase();
        
        int start=0, end=sb.length()-1;

        while(start<=end){
            if(sb.charAt(start)!=sb.charAt(end)) return false;

            start++;
            end--;
        }
        return true;
    }
}