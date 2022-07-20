class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        int n=nums.length;
        
        HashSet<Integer>hm=new HashSet<>();
        
        for(int i=0;i<n;i++)
        {
            if(!hm.contains(nums[i]))
                hm.add(nums[i]);
            
            else
                return true;
        }
        return false;
    }
}