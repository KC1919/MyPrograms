class Solution {
    public int[] twoSum(int[] a, int target) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(target-a[i]))
            {
                int ind=map.get(target-a[i]);
                return new int[]{i,ind};
            }
            
            map.put(a[i],i);
            
        }
        return new int[0];
    }
}
        
        