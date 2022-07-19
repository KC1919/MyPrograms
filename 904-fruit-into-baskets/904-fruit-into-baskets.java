class Solution {
    public int totalFruit(int[] a) {
        
        int n=a.length;
        
        int sum=0;
        
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        int max=0;
        int count=0;
        int j=0;
        
        for(int i=0;i<n;i++){
            
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
            count++;
            
            if(hm.size()<3){
                max=Math.max(count,max);
            }
            
            while(j<=i && hm.size()>2){
                
                hm.put(a[j],hm.get(a[j])-1);
                count-=1;
                
                if(hm.get(a[j])==0){
                    hm.remove(a[j]);
                }
                
                j++;
            }
            
            max=Math.max(max,count);
        }
        
        return max;
    }
}