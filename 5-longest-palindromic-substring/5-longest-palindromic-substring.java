class Solution {
    public String longestPalindrome(String s) {
        
        int n=s.length();
        
        boolean dp[][]=new boolean[n][n];
        
        int max=1;
        int si=-1, ei=-1;
        
        //implementing the gap strategy
        //traversing all the right diagonals starting from the principal diagonal
        for(int gap=0;gap<n;gap++){
            
            //traversing a diagonal
            for(int i=0,j=gap;j<n;i++,j++){
                
                //we takeout the starting chaaracter of the current substring
                //with gap=i
                char start=s.charAt(i);
                
                //we take the ending character of the substring with gap=i
                char end=s.charAt(j);
                
                //we check if the gap=0, means the substring has a single character
                if(gap==0){
                    
                    //so a single charcter is always a palindrome
                    //so we put true
                    dp[i][j]=true;
                    
                    //store the starting and end index of the single character
                    //substring
                    si=i;
                    ei=j;
                }
                
                //if the gap=1, means there are 2 characters in the substring
                else if(gap==1){
                    
                    //so we check if the start and end characcter are same or not
                    if(start==end){
                        
                        //if same, then it means the substring is palindrome
                        //because there are only 2 characters and if both are same
                        //then it will be palindrome
                        dp[i][j]=true;
                        
                        //so till now we have max length palindromic substring as 2
                        max=2;
                        
                        //we update the start and end index with the new
                        //longer substring
                        si=i;
                        ei=j;
                    }
                }
                
                //if the gap>1, means the substring has more than 2 characters
                else{
                    
                    //we check the start and end character and if they are same
                    //then we check the substring enclosed within the 
                    //start and end character, if it is also palindrome
                    if(start==end && dp[i+1][j-1]==true){
                        
                        //so we put true to mark the substring starting at
                        //ith index and ending at jth index to be palindromic
                        dp[i][j]=true;
                        
                        //then we update the max if the current substring length
                        //is longer than the previous
                        if(j-i+1>max){
                            max=j-i+1;
                            si=i;
                            ei=j;
                        }
                    }
                }
            }
        }
        
        //at last we return the substring starting with the start index and ending
        //with the end index
        return (si!=-1 && ei!=-1)?s.substring(si,ei+1):"";
    }
}