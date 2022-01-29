class Solution {
    public int longestConsecutive(int[] nums) 
    {
        HashMap<Integer,Boolean>hm=new HashMap<>();
        
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            hm.put(nums[i],true);
        }
        
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(nums[i]-1))
            {
                hm.put(nums[i],false);
            }
        }
        
        int max=0;
        for(Map.Entry<Integer,Boolean>ele:hm.entrySet())
        {
            if(ele.getValue()==true)
            {
                int start=ele.getKey();
                int count=0;
                while(hm.containsKey(start+count))
                {
                    count++;
                }
                max=Math.max(max,count);
            }
        }
        
        return max;
    }
}