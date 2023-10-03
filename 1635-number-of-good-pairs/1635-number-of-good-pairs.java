class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        HashMap<Integer,Integer>hm=new HashMap<>();

        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }

        int sum=0;

        for(int key:hm.keySet()){
            int count=hm.get(key);

            if(count>1){
                sum=sum+(count*(count-1)/2);
            }
        }
        return sum;
    }
}