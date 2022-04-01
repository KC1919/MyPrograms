class Solution {
    public void reverseString(char[] s) {
        int left=0,right=s.length-1;
        
        while(left<right)
        {
            char t=s[left];
            s[left]=s[right];
            s[right]=t;
            left++;
            right--;
        }
    }
}