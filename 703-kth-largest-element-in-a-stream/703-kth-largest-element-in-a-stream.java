class KthLargest {
    
    PriorityQueue<Integer>pq;
    int k;
    public KthLargest(int k, int[] a) {
        
        pq=new PriorityQueue<>();
        this.k=k;
        
        for(int i=0;i<a.length;i++){
            
            if(pq.size()>=k)
            {
                if(pq.peek()<a[i]){
                    pq.remove();
                    pq.add(a[i]);
                }
            }
            
            else
                pq.add(a[i]);
        }
    }
    
    public int add(int val) {
        
        if(pq.size()<k)
            pq.add(val);
        
        else if(pq.size()==k && pq.peek()<val){
            pq.add(val);
            pq.remove();
        }
        
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */