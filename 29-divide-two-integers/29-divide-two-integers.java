class Solution {
    
    long remainder=0;
    public int divide(int a, int b) {
        
        if(a==b) return 1;
        
        remainder=0;
        
        long n=Math.abs((long)a);
        long d=Math.abs((long)b);
        
        if(n<d) return 0;
        
        long res=myDivide(n,d);
        
        if(res==-1)
            return 0;
        
        if(a<0 && b<0 || a>=0 && b>=0){
            res=res;
        }
        
        else{
            res=-res;
        }
        
        if(res>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        
        if(res<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
    
        return (int)res;
    }
    
    private long myDivide(long n, long d){
        
        if(n<d){
            return Long.MIN_VALUE;
        }
        
        long count=1;
        long sum=d;
        long myres=0;
        
        while(sum<n){
    
            if((sum+sum)<=n){
                count+=count;
                sum+=sum;
            }
            
            else{
                long rem=n-sum;
                long res=myDivide(rem,d);
                
                myres=res;
                
                if(res==Long.MIN_VALUE){
                    remainder=rem;
                    return count;
                }
                
                else{
                    return count+res;
                }
            }
        }

        return count+myres;
    }
}