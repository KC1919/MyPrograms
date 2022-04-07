class Solution {
    public int lastStoneWeight(int[] stones) 
    {
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->{
            return b-a;
        });
        
        
        for(int i=0;i<stones.length;i++)
            pq.add(stones[i]);
        
        while(pq.size()>1)
        {
            int s1=pq.remove();
            int s2=pq.remove();
            
            if(s1>s2)
                pq.add(s1-s2);        
        }
        return pq.size()>0?pq.peek():0;
    }
}