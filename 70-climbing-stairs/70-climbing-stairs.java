class Solution {
    public int climbStairs(int n) {
        
        int a=1;
        int b=1;
        
        for(int i=n-2;i>=0;i--){
            
            int c=a+b;
            b=a;
            a=c;
        }
        
        return a;
    }
}