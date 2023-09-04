class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        
        HashSet<String>hm=new HashSet<>();

        for(String word:dictionary){
            hm.add(word);
        }

        Integer dp[]=new Integer[s.length()];

        return minExtras(s,0,hm,dp);
    }

    private int minExtras(String s, int idx, HashSet<String>hm, Integer dp[]){
        
        if(idx>=s.length())
            return 0;

        if(dp[idx]!=null) return dp[idx];

        int minExtra=Integer.MAX_VALUE;

        for(int i=idx;i<s.length();i++){

            int currExtra=0;
            String word=s.substring(idx,i+1);

            if(!hm.contains(word)){
                currExtra=word.length();
            }

            int rres=minExtras(s,idx+word.length(),hm,dp);

            int totalExtra=currExtra+rres;

            minExtra=Math.min(minExtra,totalExtra);
        }
        return dp[idx]=minExtra;
    }
}