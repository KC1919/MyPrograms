class Solution {
    public int fourSumCount(int[] a, int[] b, int[] c, int[] d) 
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int count=0;
        
        for(int e1:a)
        {
            for(int e2:b)
            {
                hm.put(e1+e2,hm.getOrDefault(e1+e2,0)+1);
            }
        }
        
        for(int e1:c)
        {
            for(int e2:d)
            {
                int sum=0-(e1+e2);
                
                // if(hm.containsKey(sum) && hm.get(sum)!=0)
                // {
                //     hm.put(sum,hm.get(sum)-1);
                //     count++;
                // }
                
                count+=hm.getOrDefault(sum,0);
            }
        }
        return count;
    }
}