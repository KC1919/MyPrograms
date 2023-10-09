class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashMap<Integer,Boolean>validStart=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            validStart.put(nums[i],false);
        }

        for(int i=0;i<nums.length;i++){
            if(!validStart.containsKey(nums[i]-1)){
                validStart.put(nums[i],true);
            }
        }

        int max=0;

        for(int key:validStart.keySet()){
            if(validStart.get(key)==true){
                int count=1;
                while(validStart.containsKey(key+count)){
                    count++;
                }
                max=Math.max(count,max);
            }
        }
        return max;
    }
}