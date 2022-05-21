class LRUCache {
    
    class Node{
        Node next;
        Node prev;
        int val;
        int key;
        
        Node(int key, int val){
            this.val=val;
            this.key=key;
        }
    }
    
    private int maxSize;
    private int size;
    private HashMap<Integer,Node>hm;
    private Node head;
    private Node tail;
    
    public LRUCache(int capacity) {
        hm=new HashMap<>();
        this.maxSize=capacity;
        this.size=0;
    }
    
    public void addFirst(Node node){
        
        if(head==null){
            head=node;
            tail=node;
        }
        else{
            node.next=head;
            head.prev=node;
            head=node;
        }
    }
    
    public void removeLast(){
        if(this.tail!=null){
            
            if(tail==head){
                tail=null;
                head=null;
            }
            else{
                this.tail=this.tail.prev;
                this.tail.next.prev=null; //breaking the next nodes prev link
                this.tail.next=null;  //breaking the current node's next link
            }
        }
    }
    
    public int get(int key) {
        
        if(hm.containsKey(key)){
            Node node=hm.get(key);
            
            if(node==head){
                return node.val;
            }
            
            else if(node==tail){
                removeLast();
                addFirst(node);
            }
            
            else{
                node.prev.next=node.next;
                node.next.prev=node.prev;
                node.next=null;
                node.prev=null;
                addFirst(node);
            }
            
            return node.val;
        }
        else
            return -1;
    }
    
    public void put(int key, int value) {
        
        if(hm.containsKey(key)){
            Node node=hm.get(key);
            node.val=value;
            hm.put(key,node);
            
            if(node==head){
                //do nothing
            }
            
            else if(node==tail){
                removeLast();
                addFirst(node);
            }
            
            else{
                node.prev.next=node.next;
                node.next.prev=node.prev;
                node.next=null;
                node.prev=null;
                addFirst(node);
            }
            
        }
        
        else{
            Node node=new Node(key,value);

            if(hm.size()==this.maxSize){
                int remKey=tail.key;
                hm.remove(remKey);
                removeLast();
            }

            hm.put(key,node);
            addFirst(node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */