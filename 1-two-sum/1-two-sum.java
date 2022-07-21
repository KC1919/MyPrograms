class Solution {
    public int[] twoSum(int[] a, int target) {
        
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        for(int i=0;i<a.length;i++){
            if(hm.containsKey(target-a[i])){
                return new int[]{hm.get(target-a[i]),i};
            }
            
            hm.put(a[i],i);
        }
        return new int[0];
    }
}