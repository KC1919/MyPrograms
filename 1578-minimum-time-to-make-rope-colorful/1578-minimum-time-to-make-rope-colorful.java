class Solution {
    public int minCost(String colors, int[] time) {
        
        int sum=time[0];
        int max=time[0];
        int minTime=0;
        
        for(int i=1;i<colors.length();i++){
            char c1=colors.charAt(i-1);
            char c2=colors.charAt(i);
            
            if(c1==c2){
                sum+=time[i];
                max=Math.max(time[i],max);
            }
            
            else{
                minTime+=(sum-max);
                max=time[i];
                sum=time[i];
            }
        }
        
        if(sum>max){
            minTime+=(sum-max);
        }
        
        return minTime;
    }
}