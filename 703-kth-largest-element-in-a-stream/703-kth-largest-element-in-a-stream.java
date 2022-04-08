class KthLargest {

    PriorityQueue<Integer>pq;
    int k;
    public KthLargest(int k, int[] a) {
        this.k=k;
        pq=new PriorityQueue<>();
        
        for(int i=0;i<a.length;i++){
            
            if(pq.size()<k)
                pq.offer(a[i]);
            
            else if(pq.size()==k && a[i]>pq.peek()){
                pq.offer(a[i]);
                pq.poll();
            }
        }
    }
    
    public int add(int val) {
        
        while(pq.size()>k)
            pq.poll();
        
        if(pq.size()<k)
            pq.offer(val);
            
        else if(pq.size()==k && val>pq.peek()){
            pq.offer(val);
            pq.poll();
        }
        return pq.size()>0?pq.peek():-1;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */