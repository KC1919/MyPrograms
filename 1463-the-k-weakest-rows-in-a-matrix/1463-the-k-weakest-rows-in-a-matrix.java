class Solution {

    class Pair{
        int sum;
        int idx;

        Pair(int sum, int idx){
            this.sum=sum;
            this.idx=idx;
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->{
            if(a.sum==b.sum) return b.idx-a.idx;
            else return b.sum-a.sum;
        });

        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[0].length;j++){
                sum+=mat[i][j];
            }
            Pair p=new Pair(sum,i);

            pq.add(p);
            if(pq.size()>k) pq.remove();
        }

        int ans[]=new int[k];
        int idx=k-1;

        while(pq.size()>0){
            ans[idx--]=pq.remove().idx;
        }

        return ans;
    }
}