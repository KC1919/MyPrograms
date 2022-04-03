class Solution {
    class Pair
    {
        int prev;
        int curr;
        
        Pair(int prev, int curr)
        {
            this.prev=prev;
            this.curr=curr;
        }
    }
    
    public int maxProduct(int[] a) {
        
        int max=0;
        
        // Pair dp[]=new Pair[a.length];
        
        // dp[0]=new Pair(0,a[0]);
        max=a[0];
        int oldPrev=0, oldCurr=a[0];
        
        for(int i=1;i<a.length;i++)
        {
            // Pair p=dp[i-1];
            int newPrev=0, newCurr=0;
            
            if(oldPrev<0 && oldCurr<0)
            {
                newPrev=Math.min(oldPrev,oldCurr)*a[i];
                newCurr=a[i];
            }
            
            else if((oldPrev<0 && oldCurr>0) || (oldPrev>0 && oldCurr<0))
            {
                newPrev=oldPrev*a[i];
                newCurr=oldCurr*a[i];
                // dp[i]=new Pair(p.prev*a[i],p.curr*a[i]);
            }
            
            else if(oldPrev==0 || oldCurr==0)
            {
                if(oldPrev==0 && oldCurr==0){
                    newPrev=a[i];
                    newCurr=a[i];
                    // dp[i]=new Pair(a[i],a[i]);
                }
                    
                else if(oldPrev==0){
                    newPrev=oldCurr*a[i];
                    newCurr=a[i];
                    // dp[i]=new Pair(oldCurr*a[i],a[i]);
                }
                
                else if(oldCurr==0){
                    newPrev=oldPrev*a[i];
                    newCurr=a[i];
                    // dp[i]=new Pair(p.prev*a[i],a[i]);
                }
                    
            }
            else
            {
                newPrev=oldPrev*a[i];
                newCurr=oldCurr*a[i];
                // dp[i]=new Pair(p.prev*a[i],p.curr*a[i]);
            }
            oldPrev=newPrev;
            oldCurr=newCurr;
            max=Math.max(max,Math.max(newCurr,newPrev));
        }
        return max;
    }
}