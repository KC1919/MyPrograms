class Solution {
    public int maximumUniqueSubarray(int[] a) {
        
        
        HashSet<Integer>hm=new HashSet<>();
        int n=a.length;
        
        int max=0;
        int sum=0;
        int j=0;
        
        for(int i=0;i<n;i++){
            
            if(!hm.contains(a[i])){
                hm.add(a[i]);
                sum+=a[i];
                
                max=Math.max(sum,max);
            }
            
            else{
                
                while(j<i && hm.contains(a[i])){
                    
                    hm.remove(a[j]);
                    sum-=a[j];
                    j++;
                }
                
                hm.add(a[i]);
                sum+=a[i];
            }
            
            max=Math.max(sum,max);
        }
        return max;
    }
}