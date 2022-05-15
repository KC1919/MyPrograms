class Solution {
    public int findKthLargest(int[] a, int k) {
        
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        
        for(int i=0;i<k;i++)
        {
            pq.add(a[i]);
        }
        
        for(int i=k;i<a.length;i++)
        {
            if(a[i]>pq.peek())
            {
                 pq.add(a[i]);
                 pq.remove();
            }
               
        }
        
        return pq.size()>0?pq.remove():-1;
    }
}