class Solution {
    public int strStr(String s, String t) {
        
        if(t.length()>s.length()) return -1;

        int j=0, i=0;
        int si=0;

        while(i<s.length()){

            si=i;
            while(j<t.length() && i<s.length() && s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }

            if(j==t.length()){
                return i-t.length();
            }

            j=0;
            i=si+1;

        }
        return -1;
    }
}