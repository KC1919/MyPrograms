class Solution {
    public int[] dailyTemperatures(int[] temp) {
        
        int n=temp.length;
        int ans[]=new int[n];
        
        ans[n-1]=-1;
        
        //used the jump strategy to reduce the time complexity
        //instead of using a stack, this problem is an application of
        // next greater element on the right
        
        for(int i=n-2;i>=0;i--){
            
            int j=i+1;
            while(j!=-1 && temp[j]<=temp[i]){
                j=ans[j];
            }
            ans[i]=j;
        }
        
        //so we got our next greater index for every ith index
        //we check if ith element does not have a next greater element(temperature), then
        //we put 0 at that index, otherwise if it has next greater temperature,
        //we calculate the gap between the days by subraction the ith index from the
        //next greater temperature index
        for(int i=0;i<n;i++){
            if(ans[i]==-1)
                ans[i]=0;
            else{
                ans[i]=ans[i]-i;
            }
        }
        
        //and finally we return the answer
        return ans;
    }
}