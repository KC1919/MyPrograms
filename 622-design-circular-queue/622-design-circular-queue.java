class MyCircularQueue {
    
    int a[];
    int rear;
    int front;
    int size;
    public MyCircularQueue(int k) {
        a=new int[k];
        this.front=0;
        this.rear=0;
        this.size=0;
    }
    
    public boolean enQueue(int value) {
        
        if(size==a.length){
            return false;
        } 
        
        if(rear==a.length){
            rear%=a.length;
            if(front>=0){
                a[rear++]=value;
            }
        }
        
        else
            a[rear++]=value;
        
        size++;
        
        return true;
    }
    
    public boolean deQueue() {
        if(size==0)return false;
        
        front++;
        
        if(front==a.length){
            front%=a.length;
        }
        
        size--;
        
        return true;
    }
    
    public int Front() {
        if(size==0) return -1;
        
        return a[front];
    }
    
    public int Rear() {
        if(size==0)return -1;
        
        // System.out.println(rear);
        return a[rear-1];
    }
    
    public boolean isEmpty() {
        return size==0?true:false;
    }
    
    public boolean isFull() {
        return size==a.length?true:false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */