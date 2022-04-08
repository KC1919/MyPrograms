class KthLargest {

    PriorityQueue<Integer>pq=new PriorityQueue<>();
    int k;
    public KthLargest(int k, int[] a) {
        this.k=k;
        
        for(int i=0;i<a.length;i++){
            pq.add(a[i]);
        }
    }
    
    public int add(int val) {
        
        pq.add(val);
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