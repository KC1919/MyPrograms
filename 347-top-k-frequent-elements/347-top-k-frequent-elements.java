class Solution {
   
    public int[] topKFrequent(int[] a, int k) {
        
        int n=a.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        PriorityQueue<Integer>pq=new PriorityQueue<>((b,c)->{
            return hm.get(b)-hm.get(c);
        });
        
        for(int i=0;i<a.length;i++)
        {
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }
        
        ArrayList<Integer>bucket[]=new ArrayList[n+1];
        
        for(int key:hm.keySet())
        {
            int freq=hm.get(key);
            
            if(bucket[freq]==null)
            {
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(key);

        }
        
        int ans[]=new int[k];
        int idx=0;
        
        for(int i=n;i>=0;i--)
        {
            if(bucket[i]!=null)
            {
                for(int j=bucket[i].size()-1;j>=0;j--)
                {
                    ans[idx++]=bucket[i].get(j);
                    k--;
                    
                    if(k==0)
                        return ans;
                }
                if(k==0)
                    return ans;
            }
        }
        return ans;
    }
}