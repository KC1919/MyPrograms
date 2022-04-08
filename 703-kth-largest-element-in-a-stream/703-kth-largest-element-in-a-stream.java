class KthLargest {

    PriorityQueue<Integer>pq;
    int k;
    public KthLargest(int k, int[] a) {
        this.k=k;
        pq=new PriorityQueue<>();
        
        for(int i=0;i<a.length;i++){
            
            if(pq.size()<k)
                pq.add(a[i]);
            
            else if(pq.size()==k && a[i]>pq.peek()){
                pq.add(a[i]);
                pq.remove();
            }
        }
    }
    
    public int add(int val) {
        
        if(pq.size()<k)
            pq.add(val);
            
        else if(pq.size()==k && val>pq.peek()){
            pq.add(val);
            pq.remove();
        }
                
        while(pq.size()>k)
            pq.remove();
        
        return pq.size()>0?pq.peek():-1;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */