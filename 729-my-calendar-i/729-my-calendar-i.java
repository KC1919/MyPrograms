class MyCalendar {
    
    class Pair
    {
        int start;
        int end;
        
        Pair(int start, int end){
            this.start=start;
            this.end=end;
        }
    }
    
    List<Pair>list;
    
    public MyCalendar() {
        list=new ArrayList<>();    
    }
    
    private int size=0;
    
    public boolean book(int start, int end) {
        
        
        if(size==0){
            list.add(new Pair(start,end));
            this.size++;
        }
        
        else{
            int pos=findPos(list,size-1,start);
        
            if(pos==size){
                Pair p=list.get(size-1);
                
                if(p.end>start){
                    return false;
                }
                
                else{
                    list.add(new Pair(start,end));
                    this.size++;
                }
            }
            
            else if(pos==0){
                Pair p=list.get(0);
                
                if(end>p.start){
                    return false;
                }
                
                else{
                    list.add(0,new Pair(start,end));
                    this.size++;
                }
            }
            
            else{
                Pair pb=list.get(pos-1);
                Pair pa=list.get(pos);
                
                if(pb.end>start || pa.start<end){
                    return false;
                }
                
                else{
                    list.add(pos,new Pair(start,end));
                    this.size++;
                }
            }
        }
        return true;
    }
    
    private int findPos(List<Pair>list, int high, int target){
        
        int l=0, h=high;
        
        while(l<=h){
            int mid=(l+h)/2;
            
            if(list.get(mid).start>target){
                h=mid-1;
            }
            
            else if(list.get(mid).start<target){
                l=mid+1;
            }
            
            else{
                return mid;
            }
        }
        return l;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */