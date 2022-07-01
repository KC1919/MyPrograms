class Solution {
    
    public int maximumUnits(int[][] boxes, int truckSize) {
        
        Arrays.sort(boxes,(b,c)->{
            
            if(c[1]==b[1])
                return b[0]-c[0];
            
            else
                return c[1]-b[1];    
            
        });
        
        int maxbox=0;
        int tunits=0;
        
        for(int i=0;i<boxes.length;i++){
            
            if(boxes[i][0]+maxbox<=truckSize){
                tunits+=(boxes[i][1]*boxes[i][0]);
                maxbox+=boxes[i][0];
            }
            
            else{
                int remain=truckSize-maxbox;
                tunits+=(remain*boxes[i][1]);
                maxbox+=remain;
            }

            if(tunits==truckSize){
                break;
            }
        }
        
        return tunits;
    }
}