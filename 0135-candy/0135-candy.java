class Solution {
    public int candy(int[] rate) {

        int n=rate.length;
        int cand[]=new int[n];

        Arrays.fill(cand,1);

        for(int i=1;i<n;i++){
            if(rate[i]>rate[i-1]){
                cand[i]=cand[i-1]+1;
            }
        }

        int totalCandies=cand[n-1];

        for(int i=n-2;i>=0;i--){
            if(rate[i]>rate[i+1]){
                if(cand[i]<=cand[i+1]){
                    cand[i]=cand[i+1]+1;
                }
            }
            totalCandies+=cand[i];
        }

        return totalCandies;
    }
}