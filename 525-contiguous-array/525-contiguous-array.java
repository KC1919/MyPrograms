class Solution {
    public int findMaxLength(int[] a) 
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        hm.put(0,-1);
        int sum=0, maxlen=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i]==0?-1:1;
            
            if(hm.containsKey(sum))
            {
                maxlen=Math.max(maxlen,i-hm.get(sum));
            }
            else
                hm.put(sum,i);
        }
        return maxlen;
    }
}