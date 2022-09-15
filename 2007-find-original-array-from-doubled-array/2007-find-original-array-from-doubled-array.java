class Solution {
    public int[] findOriginalArray(int[] a) {
        
        if(a.length%2!=0) return new int[0];
        
        Arrays.sort(a);
        
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        int ans[]=new int[a.length/2];
        
        for(int ele:a){
            hm.put(ele,hm.getOrDefault(ele,0)+1);
        }
        
        int idx=0;
        
        for(int ele:a){
            
            if(hm.containsKey(ele)){
                
                if(ele==0){
                    
                    if(hm.get(ele)>=2){
                        
                        ans[idx++]=ele;
                        hm.put(ele,hm.get(ele)-2);
                        
                        if(hm.get(ele)==0) hm.remove(ele);
                    }
                    
                    else break;
                }
                
                else{
                    
                    int flag=0;
                    int eleD=ele*2;
                    
                    if(hm.containsKey(eleD)){
                        hm.put(eleD,hm.get(eleD)-1);
                        if(hm.get(eleD)==0) hm.remove(eleD);

                        ans[idx++]=ele;
                        flag=1;
                    }
                    
                    else break;
                    
                    if(flag==1){
                        hm.put(ele,hm.get(ele)-1);
                        if(hm.get(ele)==0) hm.remove(ele);
                    }
                }
            }
        }
        
        if(hm.size()!=0) return new int[0];
        
        return ans;
    }
}