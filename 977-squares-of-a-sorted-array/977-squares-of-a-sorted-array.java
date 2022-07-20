class Solution {
    public int[] sortedSquares(int[] a) {
        
        int n=a.length;
    
        int ans[]=new int[n];
        
        int i=0, j=n-1;
        int idx=0;
        
        while(i<=j){
            
            if(i==j){
                ans[idx++]=a[i]*a[i];
                i++;
            }
            
            else if(Math.abs(a[i])>Math.abs(a[j])){
                ans[idx++]=a[i]*a[i];
                i++;
            }
               
            else if(Math.abs(a[i])<Math.abs(a[j])){
                ans[idx++]=a[j]*a[j];
                j--;
            }
               
            else{
                ans[idx++]=a[j]*a[j];
                ans[idx++]=a[j]*a[j];
                j--;
                i++;
            }
        }
        
        i=0;
        j=n-1;
        
        while(i<j){
            int temp=ans[i];
            ans[i]=ans[j];
            ans[j]=temp;
            i++;
            j--;
        }
        
        return ans;
    }
}