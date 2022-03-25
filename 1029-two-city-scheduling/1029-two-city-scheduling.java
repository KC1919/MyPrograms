class Solution {
    
    class Pair
    {
        int val;
        int idx;
        
        Pair(int val, int idx)
        {
            this.val=val;
            this.idx=idx;
        }
    }
    public int twoCitySchedCost(int[][] a) {
        
        Pair diff[]=new Pair[a.length];
        
        for(int i=0;i<a.length;i++)
            diff[i]=new Pair(a[i][1]-a[i][0],i);
        
        Arrays.sort(diff,(b,c)->{
            return b.val-c.val;
        });
        
        int k=a.length/2;
        int sum=0;
        
        for(int i=0;i<k;i++)
            sum+=a[diff[i].idx][1];
        
        for(int i=k;i<a.length;i++)
            sum+=a[diff[i].idx][0];
        
        return sum;
    }
}