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

        for(int i=0;i<nums.length;i++){
            if(validStart.get(nums[i])==true){
                int count=1;
                int num=nums[i];
                while(validStart.containsKey(num+1)){
                    num=num+1;
                    count++;
                }
                max=Math.max(count,max);
            }
        }
        return max;
    }
}