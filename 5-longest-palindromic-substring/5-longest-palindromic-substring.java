class Solution {
    public String longestPalindrome(String s) {
        
        int li=0, ri=0, max=0;
        int len=s.length();
        
        for(int i=0;i<len;i++)
        {
            //this condition saves us from calculating further
            //because the (len-i) gives the length of the remaining string left to
            //processed, and the maximum palindrome it can generate is twice its
            //length, so if we have already got a max length palindromic substring
            //whose length is greater than the maximum length that may be formed
            //with rest of the remaining string at some position of i, so its invain
            //to calculate that, so we break
            if(max>(len-i)*2)
                break;
            
            //this gives the longest palindromic substring starting with a single
            //midpoint, which is in case of odd length palindromic string
            int a1[]=palindrome(s,i,i);
            
            //checking if current position can give the longer palindromic substring
            if(a1[0]!=-1 && a1[1]!=-1 && a1[1]-a1[0]+1>max){
                max=a1[1]-a1[0]+1;
                li=a1[0];
                ri=a1[1];
            }
            
            //this gives the longest palindromic substring starting with two
            //midpoints, which is in case of the even length palindromic string
            //which have 2 middle characters same, so we start left pointer from the
            //1st mid point and the right pointer from the 2nd midpoint and expand
            int a2[]=palindrome(s,i,i+1);
            
            if(a2[0]!=-1 && a2[1]!=-1 && a2[1]-a2[0]+1>max){
                max=a2[1]-a2[0]+1;
                li=a2[0];
                ri=a2[1];
            }
        }
        
        if(li==-1 || ri==-1)
            return "";
        
        return s.substring(li,ri+1);
    }
    
    //returning the start and end indices of the longest palindromic substring
    //that can be enerated starting from the left and right passed indices
    public int[] palindrome(String s, int left, int right)
    {
        int li=-1, ri=-1, max=0;
        
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            if((right-left+1)>max)
            {
                li=left;
                ri=right;
                max=right-left+1;
                left--;
                right++;
            }  
        }
        return new int[]{li,ri};
    }
    
//     public String longestPalindrome(String s) {
        
//         int n=s.length();
        
//         boolean dp[][]=new boolean[n][n];
        
//         int max=1;
//         int si=-1, ei=-1;
        
//         for(int gap=0;gap<n;gap++){
            
//             for(int i=0,j=gap;j<n;i++,j++){
                
//                 char start=s.charAt(i);
//                 char end=s.charAt(j);
                
//                 if(gap==0){
//                     dp[i][j]=true;
//                     si=i;
//                     ei=j;
//                 }
                
//                 else if(gap==1){
                    
//                     if(start==end){
//                         dp[i][j]=true;
//                         max=2;
//                         si=i;
//                         ei=j;
//                     }
//                 }
                
//                 else{
                    
//                     if(start==end && dp[i+1][j-1]==true){
//                         dp[i][j]=true;
                        
//                         if(j-i+1>max){
//                             max=j-i+1;
//                             si=i;
//                             ei=j;
//                         }
//                     }
//                 }
//             }
//         }
        
//         return (si!=-1 && ei!=-1)?s.substring(si,ei+1):"";
//     }
}