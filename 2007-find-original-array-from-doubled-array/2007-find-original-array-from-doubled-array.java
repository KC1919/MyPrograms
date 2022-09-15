class Solution {
    public int[] findOriginalArray(int[] a) {
        
        if(a.length%2!=0){
            return new int[0];
        }
        
        
        Arrays.sort(a);
        
        HashMap<Double,Integer>hm=new HashMap<>();
        
        int ans[]=new int[a.length/2];
        
        for(int ele:a){
            hm.put(ele*1.0,hm.getOrDefault(ele*1.0,0)+1);
        }
        
        int idx=0;
        
        for(int i=0;i<a.length;i++){
            
            if(hm.containsKey(a[i]*1.0)){
                
                if(a[i]==0){
                    if(hm.get(a[i]*1.0)>=2){
                        ans[idx++]=a[i];
                        hm.put(a[i]*1.0,hm.get(a[i]*1.0)-2);
                        
                        if(hm.get(a[i]*1.0)==0){
                            hm.remove(a[i]*1.0);
                        }
                    }
                    else{
                        break;
                    }
                }
                
                else{
                    
                    int flag=0;
                    double ele=(a[i]*1.0)*2;
                    
                    if(hm.containsKey(ele)){
                        hm.put(ele,hm.get(ele)-1);
                        if(hm.get(ele)==0) hm.remove(ele);

                        ans[idx++]=a[i];
                        flag=1;
                    }
                    
                    else{
                        break;
                    }
                    
                    if(flag==1){
                        hm.put(a[i]*1.0,hm.get(a[i]*1.0)-1);
                        if(hm.get(a[i]*1.0)==0) hm.remove(a[i]*1.0);
                    }
                }
            }
        }
        
        if(hm.size()!=0) return new int[0];
        
        return ans;
    }
}