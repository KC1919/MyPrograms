class Solution {
    public boolean canCross(int[] stones) {
        
        if(stones[1]-stones[0]!=1){
            return false;
        }

        int n=stones.length;

        HashMap<Integer,Integer>hm=new HashMap<>();

        for(int i=0;i<n;i++){
            hm.put(stones[i],i);
        }
       
        Boolean dp[][]=new Boolean[n][n];

        boolean result=frogJump(1,stones,dp,1,hm);

        return result;
    }

    public boolean frogJump(int idx, int stones[] , Boolean dp[][], int lastJump, HashMap<Integer,Integer>hm){

        if(idx==stones.length-1) return true;

        if(dp[lastJump][idx]!=null) return dp[lastJump][idx];

        if(hm.containsKey(lastJump+stones[idx])){
            boolean res1=frogJump(hm.get(lastJump+stones[idx]),stones,dp,lastJump,hm);
            if(res1==true) return dp[lastJump][idx]=true;
        }

        if(hm.containsKey(lastJump+stones[idx]+1)){
            boolean res2=frogJump(hm.get(lastJump+stones[idx]+1),stones,dp,lastJump+1,hm);
            if(res2==true) return dp[lastJump][idx]=true;
        }

        if(lastJump>1 && hm.containsKey(lastJump+stones[idx]-1)){
            boolean res3=frogJump(hm.get(lastJump+stones[idx]-1),stones,dp,lastJump-1,hm);
            if(res3==true) return dp[lastJump][idx]=true;
        }

        return dp[lastJump][idx]=false;
    }
}