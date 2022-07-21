class Solution {
    public boolean isHappy(int n) {
        
//         Set<Integer>hm=new HashSet<>();
        
//         while(n!=1 && !hm.contains(n)){
//             hm.add(n);
//             n=getNext(n);
//         }
//         return n==1;
        
        int slowRunner = n;
        int fastRunner = getNext(n);
        while (fastRunner != 1 && slowRunner != fastRunner) {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }
        return fastRunner == 1;
    }
    
    private int getNext(int n){
        
        int sum=0;
        
        while(n>0){
            int d=n%10;
            sum+=d*d;
            n/=10;
        }
        return sum;
    }
}