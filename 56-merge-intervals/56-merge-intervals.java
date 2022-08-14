class Solution {
    public int[][] merge(int[][] inter) {
        
        Arrays.sort(inter,(a,b)->{
            
            if(a[0]==b[0])
                return a[1]-b[1];
            
            return a[0]-b[0];
        });
        
        List<int[]>list=new ArrayList<>();
        
        int start=inter[0][0];
        int end=inter[0][1];
        
        for(int i=1;i<inter.length;i++){
            
            if(inter[i][0]<=end){
                end=Math.max(end,inter[i][1]);
            }
            
            else{
                list.add(new int[]{start,end});
                start=inter[i][0];
                end=inter[i][1];
            }
        }
        
        list.add(new int[]{start,end});
        
        return list.toArray(new int[0][]);
    }
}