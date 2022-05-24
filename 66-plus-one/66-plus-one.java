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
            a=new int[n+1];
            a[0]=1;
        }
        return a;
    }
}