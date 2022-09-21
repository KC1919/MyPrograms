class Solution {
    public int minimumMountainRemovals(int[] a) {
        
        int n=a.length;
        int leftIncDp[]=new int[n];
        
        //this array would store the longest increasing subseq till ith index from
        //left
        leftIncDp[0]=1;
        
        //finding the longest increasing subsequence till ith index from left
        for(int i=1;i<n;i++){
            int max=0;
            for(int j=i-1;j>=0;j--){
                if(a[j]<a[i]){
                    leftIncDp[i]=Math.max(leftIncDp[i],leftIncDp[j]);
                }
            }
            leftIncDp[i]+=1;
        }
        
        //this array would store the longest increasing subseq till ith index from
        //right
        int rightIncDp[]=new int[n];
        
        rightIncDp[n-1]=1;
        
        //finding the longest increasing subsequence from right till ith index
        
        for(int i=n-2;i>=0;i--){
            
            for(int j=i+1;j<n;j++){
                if(a[j]<a[i]){
                    rightIncDp[i]=Math.max(rightIncDp[i],rightIncDp[j]);
                }
            }
            rightIncDp[i]+=1;
        }
        
        int max=0;
        
        
        for(int i=1;i<n;i++){
            
            int lis=rightIncDp[i];
            int lds=leftIncDp[i];
            
            //if the mountain is greater than equal to 3,
            //since if lis>1 means it would be of len>=2 and same is with lds
            //so the sum of two would always be (lis+lds)>=3
            if(lis>1 && lds>1){
                max=Math.max(lis+lds-1,max);
            }
        }
        
        //then we would return the longest mountain that can be formed after
        //removal of minimum elements
        
        return n-max;
    }
}