class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer>hs=new HashSet<>();
        hs.add(n);

        int sum=0;
        while(n>1){
            int num=n;
            sum=0;
            while(num>0){
                int d=num%10;
                sum=sum+(d*d);
                num=num/10;
            }
            if(hs.contains(sum)) return false;
            hs.add(sum);
            n=sum;
        }
        return true;
    }
}