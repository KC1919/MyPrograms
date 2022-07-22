class Solution {
    public int maximumProduct(int[] a) {
    
        int n=a.length;
        
        int m1=Integer.MAX_VALUE, m2=Integer.MAX_VALUE;
        int max1=Integer.MIN_VALUE, max2=Integer.MIN_VALUE, max3=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            
            if(a[i]<m1){
                m2=m1;
                m1=a[i];
            }
            
            else if(a[i]<m2){
                m2=a[i];
            }
            
            if(a[i]>max1){
                max3=max2;
                max2=max1;
                max1=a[i];
            }
            
            else if(a[i]>max2){
                max3=max2;
                max2=a[i];
            }
            
            else if(a[i]>max3){
                max3=a[i];
            }
        }
        
        // System.out.println("Min: "+m1+","+m2);
        // System.out.println("Max: "+max1+","+max2+","+max3);
        
        int p1=m1*m2*max1;
        int p2=max1*max2*max3;
        
        return Math.max(p1,p2);
    }
}