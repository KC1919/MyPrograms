class Solution {
    public int[][] merge(int[][] intervals) {

        int n=intervals.length;
        if(n==1) return intervals;
        
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        List<int[]>list=new ArrayList<>();

        int start=intervals[0][0];
        int end=intervals[0][1];

        for(int i=1;i<n;i++){
            if(intervals[i][0]<=end){
                end=Math.max(intervals[i][1],end);
            }
            else{
                list.add(new int[]{start,end});
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }

        list.add(new int[]{start,end});

        return list.toArray(new int[0][]);
    }
}