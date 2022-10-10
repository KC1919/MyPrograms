class Solution {
    public String breakPalindrome(String palindrome) {
        char[] s = palindrome.toCharArray();
        int n = s.length;
        
        //if any non 'a' character occurrs in 1st half of the string
        //that means that character can be replaced with 'a', to make
        //lexicographically smallest string
        for (int i = 0; i < n / 2; i++) {
            if (s[i] != 'a') {
                s[i] = 'a';
                return String.valueOf(s);
            }
        }
        
        //else if every character is 'a' in 1st half of the string
        //means, all the character in 2nd half would also be 'a' 
        //so we need to change the last character to 'b', since changing the
        //midlle character would not effect the odd length string
        s[n - 1] = 'b'; //if all 'a'
        return n < 2 ? "" : String.valueOf(s);
    }
}