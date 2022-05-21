class Solution {
    public int numDecodings(String s) 
    {
        Integer dp[]=new Integer[s.length()];
        helper(s,0,dp);
        return dp[0];
    }
    
    int helper(String s, int idx, Integer dp[])
    {
        //if the whole string is traversed means all the sets fwere successfully formed
        //so we return the answer as 1, telling that 1 way has been found to decode
        if(idx==s.length()){
            return 1;
        }
        
        //if we reach again on the same index of the string, from where we have already
        //calculated the answer to the further calls, so instead of again making
        //those calls we return the previously stored answer
        if(dp[idx]!=null)
            return dp[idx];
        
        //we have 2 choices, we can either choose a single character, or a pair of
        //character
        
        //so 1st we choose a single character
        //and check it should not be equal to 0
        //if its 0, then we simply return 0 as the answer as no ways to decode can be formed
        //further
        if(s.charAt(idx)=='0')
            return dp[idx]=0;
        
        int count=0;
        
        //now if the character chosen was not 0, so we make call to the remaining
        //set of characters
        count=helper(s,idx+1,dp);
        
        
        //and the 2nd choice is to choose a piar of characters
        //so we check if the index where we are standing rigth now
        //so the difference between the string length and the current index
        //gives the length of the remaining characters
        //so if the remaining characters are more than eqaul to 2
        //so we can choose a pair of chaarcters
        if(s.length()-idx>=2)
        {
            //choosing the 1st character
            char ch1=s.charAt(idx);
            
            //choosing the 2nd character
            char ch2=s.charAt(idx+1);
            
            //then checking if they are with the limit  of alphabetic range i.e 26
            if(((ch1-48)*10)+(ch2-48)<=26){
                
                //if they are in the range so we choose them, and ask th answer to the
                //remaining characters
                count+=helper(s,idx+2,dp);
            }
        }
        //so whatever answer we get from both the choices, we store it at the idx position
        //so that if any other choice reaches the idx position, so it does not have to 
        //recalculate the answer, instead return the stored answer
        
        return dp[idx]=count;
    }
}