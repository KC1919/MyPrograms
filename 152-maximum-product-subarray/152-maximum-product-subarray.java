class Solution {
    
    public int maxProduct(int[] a) {
        
        if(a.length==1)
            return a[0];
        
        int n=a.length;
        
        int oldPrev=a[0];
        int oldCurr=a[0];
        
        int max=a[0];
        
        for(int i=1;i<n;i++){
            
            int newPrev=0;
            int newCurr=0;
            
            if(a[i]>0){
                
                if(oldPrev<0 && oldCurr<0){
                    newPrev=a[i];
                    newCurr=Math.min(oldPrev,oldCurr)*a[i];
                }
                
                else{
                    
                    if(oldPrev==0 || oldCurr==0){
                        newPrev=a[i];
                        newCurr=a[i];
                    }
                    
                    else{
                        newPrev=oldPrev*a[i];
                        newCurr=oldCurr*a[i];
                    }
                }
            }
            
            else if(a[i]<0){
                
                if(oldPrev<0 && oldCurr<0){
                    newPrev=a[i];
                    newCurr=Math.min(oldPrev,oldCurr)*a[i];
                }
                
                else{
                    
                    if(oldPrev==0 || oldCurr==0){
                        newPrev=a[i];
                        newCurr=a[i];
                    }
                    
                    else{
                        newPrev=oldPrev*a[i];
                        newCurr=oldCurr*a[i];
                    }
                }
            }
            
            max=Math.max(max,Math.max(newCurr,newPrev));
            
            oldPrev=newPrev;
            oldCurr=newCurr;
        }
        
        return max;
    }
}