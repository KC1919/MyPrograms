class Solution {
    public int[] topKFrequent(int[] a, int k) {
        
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        for(int ele:a){
            hm.put(ele,hm.getOrDefault(ele,0)+1);
        }
        
        List<List<Integer>>list=new ArrayList<>();
        
        for(int i=0;i<=a.length;i++){
            list.add(new ArrayList<>());
        }
        
        for(int key:hm.keySet()){
            
            int freq=hm.get(key);
            
            list.get(freq).add(key);
        }
        
        int ans[]=new int[k];
        
        int idx=0;
        
        for(int i=list.size()-1;i>0;i--){
            
            for(int ele:list.get(i)){
                ans[idx++]=ele;
                k--;
                
                if(k==0){
                    return ans;
                }
            }
        }
        
        return ans;
    }
}