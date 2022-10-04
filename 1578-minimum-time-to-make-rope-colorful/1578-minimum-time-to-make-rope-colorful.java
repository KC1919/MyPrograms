class Solution {
    public int minCost(String colors, int[] time) {
        
        int sum=time[0];
        int max=time[0];
        int minTime=0;
        
        for(int i=1;i<colors.length();i++){
            char c1=colors.charAt(i-1);
            char c2=colors.charAt(i);
            
            //if two adjacent balloons are of same color, then we add its time to the 
            //current group of balloons time, and check if the time of current ballon
            //removal is greater than the rest of the balloon of its group 
            if(c1==c2){
                sum+=time[i];
                max=Math.max(time[i],max);
            }
            
            //if a balloon occurrs which is diff from the previous balloon
            //so we calculate the min time for the previous group of balloons
            //which were adjacent and of same color,
            
            //we subtract the maximum time from the whole groups time, to get the 
            //minimum time to remove rest of the balloons from that group
            //and we add that time to the total minTime.
            else{
                minTime+=(sum-max);
                max=time[i];
                sum=time[i];
            }
        }
        
        //this solves the issue, if the last group was of same color and no other color
        //baloon occurred after that, so it remains uncalculated, since the else 
        //statement wont run as there did not occurred any other color balloon after
        //this group, so we check if the sum>max, this condition will tell us that
        //if there were more than 1 balloon of same color
        if(sum>max){
            minTime+=(sum-max);
        }
        
        return minTime;
    }
}