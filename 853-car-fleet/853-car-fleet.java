class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        //making an array to store distance and time required to reach the destination
        double disTime[][]=new double[position.length][2];
        
        int n=disTime.length;
        
        //filling the distance time array
        for(int i=0;i<n;i++)
        {
            //storing the distance
            disTime[i][0]=position[i];
            
            //calculating the time and storing it in the distance time array
            //(target-position[i]) gives the remaining distance, that we divide
            //by the speed of that car to get the time.
            disTime[i][1]=(target-position[i])/(speed[i]*1.0);
        }
        
        //now we sort the distance time array in ascending order on basis of the 
        //distance from the target, i.e in order of increasing distance 
        Arrays.sort(disTime,(a,b)->{return (int)(a[0]-b[0]);});
        
        //there will atleast be 1 fleet always
        int fleet=1;
        
        //we start from the car nearest to the target
        //that is from the end of the array, we store the time of the car nearest
        //to the target
        double prevTime=disTime[n-1][1];
        
        //now we start from the 2nd nearest car from the target
        for(int i=n-2;i>=0;i--)
        {
            //we check if the ith car time is greater than the car ahead of it in the fleet
            //and the distance is also greater , so it will not be able to
            //catch the fleet ahead of it, so a new fleet will be formed for the ith car
            if(disTime[i][1]>prevTime)
            {
                //and we update the time with the current fleet's time
                prevTime=disTime[i][1];
                fleet++;  //new fleet formed
            }
            
            //else if the time required for ith car is less than or equal to the car 
            // fleet ahead of it, so the ith car can catch the fleet and become its part
            //so no need to make a new fleet
        }
        
        //in the end we have total number of fleets
        return fleet;
    }
}