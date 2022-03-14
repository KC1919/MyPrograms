class Solution {
    public boolean canReorderDoubled(int[] a) 
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int k=0;
        int n=a.length;
        
        for(int ele:a)
        {
            if(ele==0)
                continue;
            
            hm.put(ele,hm.getOrDefault(ele,0)+1);
        }
        
        
        Arrays.sort(a);
        
        for(int ele:a)
        {
            if(ele==0)
                continue;
            
            else{
                if(hm.containsKey(ele) && hm.containsKey(2*ele))
                {
                    hm.put(ele,hm.get(ele)-1);
                    if(hm.get(ele)==0)hm.remove(ele);
                    
                    hm.put(2*ele,hm.get(2*ele)-1);
                    if(hm.get(2*ele)==0)hm.remove(2*ele);
                }
            }
        }
        if(hm.size()==0)
        return true;
        
        else
            return false;
    }
}