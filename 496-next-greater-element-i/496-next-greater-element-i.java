class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        int n1=nums1.length;
        int n2=nums2.length;
        
        for(int i=0;i<n2;i++)
            hm.put(nums2[i],i);
        
        int ng[]=new int[n2];
        ng[n2-1]=-1;
        
        for(int i=n2-2;i>=0;i--)
        {
            int j=i+1;
            while(j!=-1 && nums2[i]>=nums2[j])
            {
                j=ng[j];
            }
            ng[i]=j;
        }
        
        int res[]=new int[n1];
        
        for(int i=0;i<n1;i++)
        {
            if(hm.containsKey(nums1[i]))
            {
                int ind=ng[hm.get(nums1[i])];
                
                res[i]=ind!=-1?nums2[ind]:-1;
            }
        }
        
        return res;
    }
}