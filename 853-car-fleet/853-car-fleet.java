class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        double disTime[][]=new double[position.length][2];
        
        int n=disTime.length;
        
        for(int i=0;i<n;i++)
        {
            disTime[i][0]=position[i];
            disTime[i][1]=(target-position[i])/(speed[i]*1.0);
        }
        
        
        Arrays.sort(disTime,(a,b)->{return (int)(a[0]-b[0]);});
        
        int fleet=1;
        
        double prevTime=disTime[n-1][1];
        
        for(int i=n-2;i>=0;i--)
        {
            if(disTime[i][1]>prevTime)
            {
                prevTime=disTime[i][1];
                fleet++;
            }
        }
        
        return fleet;
    }
}