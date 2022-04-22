class MyHashMap {
    Integer a[];
    public MyHashMap() {
        a=new Integer[1000002];
    }
    
    public void put(int key, int value) {
        a[key]=value;
    }
    
    public int get(int key) {
        
        if(a[key]!=null)
        return a[key];
        
        return -1;
    }
    
    public void remove(int key) {
        a[key]=null;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */