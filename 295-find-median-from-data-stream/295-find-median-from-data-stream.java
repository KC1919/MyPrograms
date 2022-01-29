class MedianFinder 
{
    
    public static PriorityQueue<Integer>left;
    public static PriorityQueue<Integer>right;
    
    public MedianFinder() 
    {
        left=new PriorityQueue<>(Collections.reverseOrder());
        right=new PriorityQueue<>();
    }
    
    public void addNum(int val) 
    {
        if(right.size()>0 && val>right.peek())
        {
            right.add(val);
        }
        else
        {
            left.add(val);
        }
        
        balanceHeaps();
        
    }
    
    //Function to balance heaps.
    public static void balanceHeaps()
    {
       if(Math.abs(left.size()-right.size())>1)
       {
           if(left.size()>right.size())
           right.add(left.remove());
           
           else if(left.size()<right.size())
           left.add(right.remove());
       }
    }
    
    //Function to return Median.
    public static double findMedian()
    {
        int size=size();
        
        if(size==1)
        return left.peek();
        
        if(size%2==0)
        {
            return (left.peek()*1.0+right.peek()*1.0)/2;
        }
        else
        {
            if(left.size()>right.size())
            return left.peek();
            
            else
            return right.peek();
        }
    }
    
    public static int size()
    {
        return left.size()+right.size();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */