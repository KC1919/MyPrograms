class Solution {
    public int[] productExceptSelf(int[] a) {
        int n=a.length;
        int ans[]=new int[n];
        
        //Here first we calculate the prefix product for every ith position
        int prefix=1;
        
        for(int i=0;i<n;i++){
            ans[i]=prefix;
            prefix*=a[i];
        }
        
        //then we start traversing the array from the end, and take postfix product, when we reach the ith position we have with us the postfix product we calculated till ith position, So we multiply the prefix product already stored at ith position with the postfix product and we store the result at the ith position.
        
        //using this strategy, we are able to save space of storing prefix and postfix in seperate arrays.
        
        int postfix=1;
        
        for(int i=n-1;i>=0;i--){
            ans[i]*=postfix;
            postfix*=a[i];
        }
        return ans;
    }
}