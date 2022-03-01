class Solution {
    public int firstMissingPositive(int[] a) {
        
        HashSet<Integer>hm=new HashSet<>();
        int mini=Integer.MAX_VALUE;
        
        for(int e:a){
            if(e>0 && e<mini)
                mini=e;
            
            hm.add(e);
        }
        
        if(mini>1 || mini==Integer.MAX_VALUE)
            return 1;
        
        int min=Integer.MAX_VALUE;
        for(int ele:a)
        {
            if(ele>=0){
                int lm=ele-1;
                int rm=ele+1;
                
                if(lm>0 && !hm.contains(lm))
                    min=Math.min(min,lm);
                
                if(rm>0 &&!hm.contains(rm))
                    min=Math.min(min,rm);
            }
        }
        return min;
    }
}