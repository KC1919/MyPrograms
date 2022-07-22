class Solution {
    public int eraseOverlapIntervals(int[][] inter) {
        
        Arrays.sort(inter,(a,b)->{
            
            if(a[0]==b[0])
                return a[1]-b[1];

            else
                return a[0]-b[0];
        });
        
        int start=inter[0][0], end=inter[0][1];
        int count=0;
        
        for(int i=1;i<inter.length;i++){
            
            if(inter[i][0]<end){
                count++;
                end=Math.min(end,inter[i][1]);
            }
            else{
                start=inter[i][0];
                end=inter[i][1];
            }
        }
        return count;
    }
}