class Solution {
    
    class Pair{
        int diff;
        int idx;
        
        Pair(int diff, int idx){
            this.diff=diff;
            this.idx=idx;
        }
    }
    
    public List<Integer> findClosestElements(int[] a, int k, int x) {
        
        List<Integer>list=new ArrayList<>();
        
        PriorityQueue<Pair>pq=new PriorityQueue<>((b,c)->{
            if(b.diff==c.diff){
                return b.idx-c.idx;
            }
            
            return c.diff-b.diff;
        });
        
        for(int i=0;i<a.length;i++){
            int d=Math.abs(x-a[i]);
            
            if(pq.size()<k)
                pq.add(new Pair(d,i));
            
            else if(pq.size()==k){
                
                if(pq.peek().diff>d){
                    pq.remove();
                    pq.add(new Pair(d,i));
                }
            }
        }
        
        while(pq.size()>0){
            list.add(a[pq.remove().idx]);
        }
        
        Collections.sort(list);
        return list;
    }
}