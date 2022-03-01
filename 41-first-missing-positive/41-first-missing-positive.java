class Solution {
    public int firstMissingPositive(int[] a) {
        
        HashSet<Integer>hm=new HashSet<>();
        int mini=Integer.MAX_VALUE;
        
        for(int i=0;i<a.length;i++){
            if(a[i]>0 && a[i]<mini)
                mini=a[i];
            
            hm.add(a[i]);
        }
        
        if(mini>1 || mini==Integer.MAX_VALUE)
            return 1;
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>=0){
                int lm=a[i]-1;
                int rm=a[i]+1;
                
                if(lm>0 && !hm.contains(lm))
                    min=Math.min(min,lm);
                
                if(rm>0 &&!hm.contains(rm))
                    min=Math.min(min,rm);
            }
        }
        return min;
    }
}