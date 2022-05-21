class LRUCache {
    
    //making a doubly linked node
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
    private HashMap<Integer,Node>hm;  //a hashmap of Key Vs Node
    private Node head;
    private Node tail;
    
    public LRUCache(int capacity) {
        hm=new HashMap<>();
        this.maxSize=capacity;
    }
    
    //method to add node to the head of the list
    public void addFirst(Node node){
        
        if(head==null){
            head=node;
            tail=node;
        }
        else{
            node.next=head; //linking the node  to the head
            head.prev=node; //linking the head's prev conn to new node
            head=node; //making the new node as the head
        }
    }
    
    //method to remove last node from the list
    public void removeLast(){
        
        //checking if the tail is not null, means the list is not empty
        if(this.tail!=null){
            
            //if the tail and head are equal , means there is only single node
            //present in the list, so we remove it by making it null
            if(tail==head){
                tail=null;
                head=null;
            }
            
            //if there are more than one nodes in the list
            else{
                
                //we remove the tail node, and make the 2nd last node as the new tail
                this.tail=this.tail.prev;
                this.tail.next.prev=null; //breaking the next nodes prev link
                this.tail.next=null;  //breaking the current node's next link
            }
        }
    }
    
    //this method return the key node value if it is present int he list
    public int get(int key) {
        
        //check if it is present
        if(hm.containsKey(key)){
            
            //if yes, we fetch it from the map
            Node node=hm.get(key);
            
            if(node==head)
                return node.val;
            
            else{
                removeMid(node);
            }
            
            
            //and return node's value
            return node.val;
        }
        
        //if the requested key node is not present in the list ,return -1
        else
            return -1;
    }
    
    public void removeMid(Node node){
        //we check if the fetched node is the head node
            //if yes, we do not need to do anything as this is the most recent node as it
            //at the head of the list, so we simply return its value
            if(node==head){
                //do nothing;
            }
            
            //if the node is a tail node
            else if(node==tail){
                //we remove it from the last
                removeLast();
                
                //and add it to the head of the list, making it the most recently used node
                addFirst(node);
            }
            
            //else if the node is somewhere in the list other than tail and head
            else{
                
                //so we link the nodes prev node to the node's next node
                node.prev.next=node.next;
                node.next.prev=node.prev;
                
                //and break the node's prev and next link
                node.next=null;
                node.prev=null;
                
                //and add the node to the head of the list
                //to make it as the most recently used node
                addFirst(node);
            }
    }
    
    //this method add new node to the list
    public void put(int key, int value) {
        
        //we check if the node is already present in the list
        if(hm.containsKey(key)){
            Node node=hm.get(key);
            node.val=value;
            hm.put(key,node);
            
//             if(node==head){
//                 //do nothing
//             }
            
//             else if(node==tail){
//                 removeLast();
//                 addFirst(node);
//             }
            
//             else{
//                 node.prev.next=node.next;
//                 node.next.prev=node.prev;
//                 node.next=null;
//                 node.prev=null;
//                 addFirst(node);
//             }
            removeMid(node);
            
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