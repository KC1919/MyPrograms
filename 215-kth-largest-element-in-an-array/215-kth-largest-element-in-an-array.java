class Solution {
    public int findKthLargest(int[] a, int k) {
        
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        
        for(int i=0;i<a.length;i++){
            
            if(pq.size()<k)
                pq.add(a[i]);
            
            else{
                
                if(pq.peek()<a[i]){
                    pq.add(a[i]);
                    pq.remove();
                }
            }
        }
        
        return pq.size()>0?pq.remove():-1;
    }
}