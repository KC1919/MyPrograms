class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int i=0;
        int j=0;
        int prev=-1;

        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j) && j>prev){
                prev=j;
                i++;
            }
            j++;
        }

        if(i==s.length()) return true;

        return false;
    }
}