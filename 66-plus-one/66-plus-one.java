class Solution {
    public int[] plusOne(int[] a) {
        
        int n=a.length;
        
        a[n-1]+=1;
        int carry=0;
        
        if(a[n-1]==10){
            a[n-1]=0;
            carry=1;
        }
            
        for(int i=a.length-2;i>=0;i--){
            
            if(carry>0){
                carry=0;
                a[i]+=1;
            }
            
            if(a[i]>9){
                a[i]=0;
                carry=1;
            }
        }
        
        
        if(carry==1){
            
            int ans[]=new int[a.length+1];
            ans[0]=1;
            
            for(int i=1;i<=a.length;i++){
                ans[i]=a[i-1];
            }
            return ans;
        }
        
        return a;
        
    }
}