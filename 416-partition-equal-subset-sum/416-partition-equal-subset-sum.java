class Solution {
    public boolean canPartition(int[] a) {
        int sum=0;
        
        int n=a.length;
        
        for(int i=0;i<n;i++)
        sum+=a[i];
        
        // if the sum cannot be divided into two equal halves, then it is not 
        // possible to partition
        if(sum%2!=0)
            return false;
        
        //else we divide the sum, since we know that if we can make half the sum
        //with the elements of the aray, the rest half can also be made
        int target=sum/2;
        
        //we make a dp table, with elements VS target sum
        boolean dp[][]=new boolean[n][target+1];
        
        //we take an element one by one
        for(int i=0;i<n;i++){
            
            //we go from sum 1 till target
            for(int j=1;j<=target;j++)
            {
                
                //we check if the current element is greater than the current
                //target sum
                if(j<a[i]){
                    
                    //so it check whether if the previous elements were able to make
                    // this target sum, if yes then this target sum could be
                    //made
                    if(i>0 && dp[i-1][j]==true)
                        dp[i][j]=true;
                    
                    //else we put false, becaoz the previous were not able to make
                    //and the current element is also greater than the current
                    // target sum, so it can also not make
                    else
                        dp[i][j]=false;
                }
                
                
                else{
                    
                    //if the current target sum is equal to the current element, 
                    // then this target can be made, so we put true
                    if(j==a[i]){
                        dp[i][j]=true;
                    }
                    
                    //else if the target sum is greater than the current element
                    //then we check can the sum of (target-currEle) can be made
                    //by the previous elements, because if that can be made, the
                    //the current element will be able to make the remaining
                    else if(j>a[i]){
                        
                        //if yes then we put true
                        if(i>0 && dp[i-1][j-a[i]]==true){
                            dp[i][j]=true;
                        }
                        
                        else if(i>0 && dp[i-1][j]==true)
                        dp[i][j]=true;
                    }
                }
                
                //we check if the final target sum can be made we return true
                if(j==target && dp[i][j]==true)
                    return true;
            }
        }
        
        return false;
    }
}