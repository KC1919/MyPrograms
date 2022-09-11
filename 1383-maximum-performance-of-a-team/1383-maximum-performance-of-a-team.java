class Solution {
    public int maxPerformance(int n, int[] speed, int[] effi, int k) {
        
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        
        int p[][]=new int[n][2];
        
        for(int i=0;i<n;i++){
            p[i][0]=effi[i];
            p[i][1]=speed[i];
        }
        
        //sort the array in decreasing order of efficiency
        Arrays.sort(p,(a,b)->{
            return b[0]-a[0];
        });
        
        long max=0;
        long sum=0;
        
        for(int i=0;i<n;i++){
            
            //keep adding the speed to the PQ
            pq.add(p[i][1]);
            sum+=p[i][1];  //summing of the speeds
            
            //while k members have not been reached we calculateour max performance
            //since we have to calculate at most k
            if(pq.size()<k)
                max=Math.max(p[i][0]*sum,max);
            
            //if k members have been considered
            else if(pq.size()==k){
                max=Math.max(p[i][0]*sum,max); //we again calculate with all k members
                sum-=pq.remove(); //then remove the member with lowest speed
            }                     //becoz we need to maximize the performance and the
        }                         //efficiency tends to decrease as we iterate so we
                                  //tend to include member who has greater speed
        
        return (int) (max % 1000000007);
    }
}