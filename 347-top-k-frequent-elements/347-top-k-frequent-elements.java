class Solution {
    
    class Pair
    {
        int freq;
        int val;
        
        Pair(int val, int freq)
        {
            this.val=val;
            this.freq=freq;
        }
    }
    public int[] topKFrequent(int[] a, int k) {
        
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        PriorityQueue<Pair>pq=new PriorityQueue<>((b,c)->{
            return b.freq-c.freq;
        });
        
        for(int i=0;i<a.length;i++)
        {
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }
        
        for(int key:hm.keySet())
        {
            if(pq.size()<k)
                pq.add(new Pair(key,hm.get(key)));
            
            else if(pq.size()==k)
            {
                if(hm.get(pq.peek().val)<hm.get(key))
                {
                    pq.remove();
                    pq.add(new Pair(key,hm.get(key)));
                }
            }
        }
        
        int ans[]=new int[k];
        int idx=0;
        
        while(pq.size()>0)
        {
            ans[idx++]=pq.remove().val;
        }
        
        return ans;
    }
}