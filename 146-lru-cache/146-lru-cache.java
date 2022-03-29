class LRUCache {
    
    class Node
    {
        int key;
        int value;
        Node next;
        Node prev;
        
        Node(int key, int value)
        {
            this.key=key;
            this.value=value;
            this.prev=null;
            this.next=null;
        }
    }
    
    HashMap<Integer,Node>hm;
    int maxSize;
    int size;
    
    Node head;
    Node tail;
    
    public LRUCache(int capacity) {
        this.maxSize=capacity;
        this.size=0;
        this.hm=new HashMap<>();
        this.head=this.tail=null;
    }
    
    public void addFirst(int key, int value){
        
        Node n=new Node(key,value);
        if(this.head==null && this.tail==null){
            this.head=this.tail=n;
        }
        
        else{
            this.head.prev=n;
            n.next=this.head;
            this.head=n;
        }
        hm.put(key,n);
    }
    
    public void remove(int key)
    {
        Node node=hm.get(key);
        
        if(node==this.head && node==this.tail){
            this.tail=this.head=null;
        }
        
        else if(node==head){
            this.head=node.next;
            node.next.prev=null;
            node.next=null;
        }
        
        else if(node==this.tail)
        {
            this.tail=node.prev;
            node.prev.next=null;
            node.prev=null;
        }
        
        else
        {
            node.prev.next=node.next;
            node.next.prev=node.prev;
            node.prev=null;
            node.next=null;
        }
        hm.remove(key);
    }
    
    public int get(int key) {
        if(!hm.containsKey(key)) return -1;
        
        else{
            
            Node node=hm.get(key);
            
            if(node==this.head)
                return node.value;
            
            else{
                remove(key);
            }
            addFirst(key,node.value);
            return node.value;
        }
    }
    
    public void put(int key, int value) {
        
        if(hm.containsKey(key)){
            remove(key);
            addFirst(key,value);
        }
        
        else{
            
            if(this.size==this.maxSize){
                addFirst(key,value);
                int remKey=tail.key;
                remove(remKey);
            }
            
            else{
                addFirst(key,value);
                this.size++;
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */