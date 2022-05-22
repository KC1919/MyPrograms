class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        
        boolean dp[][]=new boolean[n][n];
        
        int count=0;
        
        int max=1;
        
        //traversing on all the diagonals
        for(int gap=0;gap<n;gap++){
            
            //traversing the diagonal
            for(int i=0,j=gap;j<n;i++,j++){
                
                //taking the starting character of the substring
                char start=s.charAt(i);
                
                //taking the ending character of the substring
                char end=s.charAt(j);
                
                //if the gap is 0, means the usbtrign start and end at same character
                if(gap==0){
                    //soa single character is always palinfrome, so we put true
                    dp[i][j]=true;
                    count++;
                }
                
                //if the gap is 1, means the substring is of length=2
                else if(gap==1){
                    
                    //so we check if the 1st and last character is same or not
                    if(start==end){
                        
                        //if same we put true
                        dp[i][j]=true;
                        count++;
                    }
                }
                
                else{
                    
                    //if the gap is more than 1, means the substring is of length 
                    //greater than 2
                    
                    //so we check if the 1st and last character are same, and also check if 
                    //the string between the 1st and last character is palindrome or not
                    if(start==end && dp[i+1][j-1]==true){
                        //if the conditions are true, then we mark it as true
                        dp[i][j]=true;
                        count++;
                    }
                }
            }
        }
        return count;
    }
}