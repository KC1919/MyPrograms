class Solution {
   
    public int[] topKFrequent(int[] a, int k) {
        
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        PriorityQueue<Integer>pq=new PriorityQueue<>((b,c)->{
            return hm.get(b)-hm.get(c);
        });
        
        for(int i=0;i<a.length;i++)
        {
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }
        
        for(int key:hm.keySet())
        {
            if(pq.size()<k)
                pq.add(key);
            
            else if(pq.size()==k)
            {
               if(hm.get(key)>hm.get(pq.peek())){
                   pq.remove();
                   pq.add(key);
               }
            }
        }
        
        int ans[]=new int[k];
        int idx=0;
        
        while(pq.size()>0)
        {
            ans[idx++]=pq.remove();
        }
        
        return ans;
    }
}