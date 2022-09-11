class Solution {
    public int maxPerformance(int n, int[] speed, int[] effi, int k) {
        
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        
        int p[][]=new int[n][2];
        
        for(int i=0;i<n;i++){
            p[i][0]=effi[i];
            p[i][1]=speed[i];
        }
        
        Arrays.sort(p,(a,b)->{
            return b[0]-a[0];
        });
        
        long max=0;
        long sum=0;
        
        for(int i=0;i<n;i++){
            
            pq.add(p[i][1]);
            sum+=p[i][1];
            
            if(pq.size()<k)
                max=Math.max(p[i][0]*sum,max);
            
            else if(pq.size()==k){
                max=Math.max(p[i][0]*sum,max);
                sum-=pq.remove();
            }
        }
        
        return (int) (max % 1000000007);
    }
}