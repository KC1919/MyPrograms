class Solution {
    public int findKthLargest(int[] a, int k) 
    {
        if(k<0 || k>a.length)
            return -1;
            
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        
        for(int i=0;i<a.length;i++)
        {
            if(pq.size()<k)
                pq.add(a[i]);
            
            else if(a[i]>=pq.peek())
            {
                 pq.add(a[i]);
                 pq.remove();
            }
               
        }
        return pq.peek();
    }
}