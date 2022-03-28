class RandomizedCollection {
    
    HashMap<Integer,HashSet<Integer>>hm;
    ArrayList<Integer>list;
    Random r;
    public RandomizedCollection() {
        r=new Random();
        hm=new HashMap<>();
        list=new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(hm.containsKey(val) && hm.get(val).size()>0)
        {
            list.add(val);
            hm.get(val).add(list.size()-1);
            return false;
        }
        
        else
        {
            list.add(val);
            hm.put(val,new HashSet<>());
            hm.get(val).add(list.size()-1);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(!hm.containsKey(val) || hm.get(val).size()==0)
            return false;
        
        int vidx=hm.get(val).iterator().next();
        int lidx=list.size()-1;
        hm.get(val).remove(vidx);
            
        int lval=list.get(lidx);
            
        list.set(vidx,lval);
            
        hm.get(lval).add(vidx);
        hm.get(lval).remove(lidx);
        list.remove(lidx);
            
        return true;
        
    }
    
    public int getRandom() {
        int ridx=r.nextInt(list.size());
        return list.get(ridx);
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */