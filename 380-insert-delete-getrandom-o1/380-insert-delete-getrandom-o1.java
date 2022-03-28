class RandomizedSet {
    
    HashMap<Integer,Integer>hm;
    ArrayList<Integer>list;
    Random r;
    public RandomizedSet() {
        r=new Random();
        hm=new HashMap<>();
        list=new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(hm.containsKey(val))
            return false;
        
        else
        {
            list.add(val);
            hm.put(val,list.size()-1);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(!hm.containsKey(val))
            return false;
        
        else
        {
            int idx=hm.get(val);
            int lidx=list.size()-1;
            
            int temp=list.get(lidx);
            list.set(idx,temp);
            list.set(lidx,val);
            hm.put(val,lidx);
            hm.put(temp,idx);
            
            list.remove(list.size()-1);
            hm.remove(val);
            
            return true;
        }
    }
    
    public int getRandom() {
        int ridx=r.nextInt(list.size());
        return list.get(ridx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */