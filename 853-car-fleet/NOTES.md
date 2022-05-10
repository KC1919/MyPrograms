**Think on the basis of time vs distance**
​
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