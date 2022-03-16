class Solution {
    public int[] topKFrequent(int[] a, int k) 
    {
        int n=a.length;
        
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        for(int i=0;i<n;i++)
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        
        
        List<List<Integer>>list=new ArrayList<>();
        
        for(int i=0;i<=n;i++)
            list.add(null);
        
        int ans[]=new int[k];
        
        for(int key : hm.keySet()){
            int number =key;
            int count = hm.get(key);
            
            if(list.get(count) == null)
                list.set(count, new ArrayList<>());
            
            list.get(count).add(number);
            }
        
        int p=0;
        for(int i=n;i>=0;i--)
        {
            if(list.get(i) == null)
                continue;
            for(int j = list.get(i).size() - 1; j >= 0; j--){
                ans[p++] = list.get(i).get(j);
                k--;
                if(k==0)
                    return ans;
            }
        }
        return ans;
    }
}