class Solution {
    public boolean containsNearbyDuplicate(int[] a, int k) {
        
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        for(int i=0;i<a.length;i++){
            if(!hm.containsKey(a[i])){
                hm.put(a[i],i);
            }
            
            else{
                if(i-hm.get(a[i])<=k){
                    return true;
                }
                else{
                    hm.put(a[i],i);
                }
            }
        }
        return false;
    }
}