class Solution {
    public int[] topKFrequent(int[] a, int k) {
        
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        for(int ele:a){
            hm.put(ele,hm.getOrDefault(ele,0)+1);
        }
        int n=a.length;
        ArrayList<Integer>list[]=new ArrayList[n+1];
        
        for(int key:hm.keySet()){
            
            int freq=hm.get(key);
            
            if(list[freq]==null){
                list[freq]=new ArrayList<>();
            }
            list[freq].add(key);
        }
        
        int ans[]=new int[k];
        
        int idx=0;
        
        for(int i=n;i>0;i--){
            
            if(list[i]!=null){
                for(int ele:list[i]){
                    ans[idx++]=ele;
                    k--;

                    if(k==0){
                        return ans;
                    }
                }
            }
        }
        return ans;
    }
}