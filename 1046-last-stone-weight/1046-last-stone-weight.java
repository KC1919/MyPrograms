class Solution {
    public int lastStoneWeight(int[] a) {
        
        PriorityQueue<Integer>pq=new PriorityQueue<>((b,c)->{
            return c-b;
        });
        
        for(int i=0;i<a.length;i++){
            pq.add(a[i]);
        }
        
        while(pq.size()>1){
            
            int s1=pq.remove();
            int s2=pq.remove();
            
            if(s1!=s2){
                pq.add(s1-s2);
            }
        }
        
        return pq.size()>0?pq.remove():0;
    }
}