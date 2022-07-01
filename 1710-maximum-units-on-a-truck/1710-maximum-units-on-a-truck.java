class Solution {
    
    class Pair
    {
        int boxes;
        int units;
        int idx;
        
        Pair(int boxes, int units, int idx){
            this.boxes=boxes;
            this.idx=idx;
            this.units=units;
        }
    }
    public int maximumUnits(int[][] boxes, int truckSize) {
        
        
        Pair a[]=new Pair[boxes.length];
        
        for(int i=0;i<boxes.length;i++){
            a[i]=new Pair(boxes[i][0],boxes[i][1],i);
        }
        
        Arrays.sort(a,(b,c)->{
            
            if(c.units==b.units){
                return b.boxes-c.boxes;
            }
            
            else{
                return c.units-b.units;    
            }
            
        });
        
        int maxbox=0;
        int tunits=0;
        
        for(int i=0;i<a.length;i++){
            
            Pair p=a[i];
            
            // System.out.println(a[i].units+", "+a[i].boxes);
            
            if(p.boxes+maxbox<=truckSize){
                tunits+=(p.units*p.boxes);
                maxbox+=p.boxes;
            }
            
            else{
                int remain=truckSize-maxbox;
                tunits+=(remain*p.units);
                maxbox+=remain;
            }

            if(tunits==truckSize){
                break;
            }
        }
        
        return tunits;
    }
}