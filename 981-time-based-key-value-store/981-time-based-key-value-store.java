class TimeMap {
    
    HashMap<String,HashMap<Integer,String>>hm;
    
    HashMap<String,List<Integer>>bucket;
    public TimeMap() {
        hm=new HashMap<>();
        bucket=new HashMap<>();
    }
  
    public void set(String key, String value, int timestamp) {
        
        if(!hm.containsKey(key)){
            hm.put(key,new HashMap<>());
            bucket.put(key,new ArrayList<>());
            bucket.get(key).add(timestamp);
        }
        
        hm.get(key).put(timestamp,value);
        List<Integer>temp=bucket.get(key);
        if(temp.get(temp.size()-1)<timestamp){
            bucket.get(key).add(timestamp);
        }
    }
    
    public String get(String key, int timestamp) {
        if(hm.containsKey(key)){
            if(hm.get(key).containsKey(timestamp)){
                return hm.get(key).get(timestamp);
            }
            
            else{
                List<Integer>timeList=bucket.get(key);
                int pos=findPos(timeList,timestamp);
                
                if(pos==0){
                    return "";
                }
                
                int prevTime=timeList.get(pos-1);
                return hm.get(key).get(prevTime);
            }
        }
        
        else{
            return "";
        }
    }
    
    private int findPos(List<Integer>list, int target){
        
        int lo=0, hi=list.size()-1;
        
        while(lo<=hi){
            int mid=(lo+hi)/2;
            
            if(list.get(mid)==target){
                return mid;
            }
            
            else if(list.get(mid)<target){
                lo=mid+1;
            }
            
            else if(list.get(mid)>target){
                hi=mid-1;
            }
        }
        
        return lo;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */