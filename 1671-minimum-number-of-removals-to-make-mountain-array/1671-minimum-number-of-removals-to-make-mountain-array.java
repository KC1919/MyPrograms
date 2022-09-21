class Solution {
    public int minimumMountainRemovals(int[] a) {
        
        int n=a.length;
        int rightIncDp[]=new int[n];
        
        rightIncDp[0]=1;
        
        for(int i=1;i<n;i++){
            int max=0;
            for(int j=i-1;j>=0;j--){
                if(a[j]<a[i]){
                    rightIncDp[i]=Math.max(rightIncDp[i],rightIncDp[j]);
                }
            }
            rightIncDp[i]+=1;
        }
        
        int leftIncDp[]=new int[n];
        
        leftIncDp[n-1]=1;
        
        for(int i=n-2;i>=0;i--){
            
            for(int j=i+1;j<n;j++){
                if(a[j]<a[i]){
                    leftIncDp[i]=Math.max(leftIncDp[i],leftIncDp[j]);
                }
            }
            leftIncDp[i]+=1;
        }
        
        int max=0;
        
        for(int i=1;i<n;i++){
            
            int lis=rightIncDp[i];
            int lds=leftIncDp[i];
            
            if(lis>1 && lds>1 && (lis+lds-1)>=3){
                max=Math.max(lis+lds-1,max);
            }
        }
        return n-max;
    }
}