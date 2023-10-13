class Solution {
    public int[][] merge(int[][] intervals) {

        int n=intervals.length;
        if(n==1) return intervals;
        
        Arrays.sort(intervals,(a,b)->{
            return a[0]-b[0];
        });

        List<int[]>list=new ArrayList<>();

        int start=intervals[0][0];
        int end=intervals[0][1];

        for(int i=1;i<n;i++){
            if(intervals[i][0]<=end){
                end=Math.max(intervals[i][1],end);
            }
            else{
                int merge[]=new int[2];
                merge[0]=start;
                merge[1]=end;
                list.add(merge);
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }

        int merge[]=new int[2];
        merge[0]=start;
        merge[1]=end;
        list.add(merge);

        int res[][]=new int[list.size()][2];

        for(int i=0;i<list.size();i++){
            res[i][0]=list.get(i)[0];
            res[i][1]=list.get(i)[1];
        }
        return res;
    }
}