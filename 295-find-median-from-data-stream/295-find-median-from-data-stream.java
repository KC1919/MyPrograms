class MedianFinder {
    
    PriorityQueue<Integer>left;
    PriorityQueue<Integer>right;
    
    public MedianFinder() {
        
        left=new PriorityQueue<>((a,b)->{
            return b-a;
        });
        
        right=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        
        if(right.size()>0 && num>right.peek()){
            right.add(num);
        }
        
        else{
            left.add(num);
        }
        
        balance();
    }
    
    private void balance(){
        
        if(Math.abs(left.size()-right.size())>1){
            if(right.size()>left.size()){
                left.add(right.remove());
            }

            else if(left.size()>right.size()){
                right.add(left.remove());
            }
        }
    }
    
    public double findMedian() {
        int size=left.size()+right.size();
        
        if(size==1){
            return left.peek();
        }
        
        if(size%2==0){
            return ((left.peek()+right.peek())*1.0)/2;
        }
        
        else
        {
            if(left.size()>right.size())
            return left.peek();
            
            else
            return right.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */