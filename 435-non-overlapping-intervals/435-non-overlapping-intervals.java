class Solution {
    public int eraseOverlapIntervals(int[][] a) {
        
        Arrays.sort(a,(b,c)->{
            return b[0]-c[0];
        });
        
        int start=a[0][0];
        int end=a[0][1];
        
        int count=0;
        
        for(int i=1;i<a.length;i++){
            
            if(a[i][0]<end){
                count++;
                end=Math.min(end,a[i][1]);
            }
                
            else{
                start=a[i][0];
                end=a[i][1];
            }
        }
        return count;
    }
}