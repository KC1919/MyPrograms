class MyHashMap {
    static class Node {
        int key, value;
        Node next;
        Node (int _key, int _value) {
            key = _key;
            value = _value;
        }
    }

    Node[] nodes = new Node[10006];

    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        // Collision Handling in put: 
        // In the put method, 
        // you are updating the value if the key already exists. 
        // However, you should also check if the key exists when the cur.next is null 
        // (i.e., at the end of the linked list).
        int index = key % nodes.length;
        if (nodes[index] != null) {
            Node prev = null;
            Node cur = nodes[index];
            while (cur != null && cur.key != key) {
                prev = cur;
                cur = cur.next;
            }

            if (cur != null) {
                cur.value = value;
            } else {
                Node item = new Node(key, value);
                prev.next = item;
            }
        } else {
            Node item = new Node(key, value);
            nodes[index] = item;
        }
    }
    
    public int get(int key) {
        int index = key % nodes.length;
        if (nodes[index] != null) {
            Node cur = nodes[index];
            while (cur != null) {
                if (cur.key == key) {
                    return cur.value;
                }
                cur = cur.next;
            }
        } 
        return -1;
    }
    
    public void remove(int key) {
        // Remove Method: The remove method is missing handling for removing the first node in the linked list. 
        // You should update the nodes[index] reference if you remove the first node.
        int index = key % nodes.length;
        if (nodes[index] != null) {
            Node prev = null;
            Node cur = nodes[index];
            while (cur != null && cur.key != key) {
                prev = cur;
                cur = cur.next;
            }

            if (cur != null) {
                if (prev != null) {
                    prev.next = cur.next;
                } else {
                    nodes[index] = cur.next;
                }
            }
        }          
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */