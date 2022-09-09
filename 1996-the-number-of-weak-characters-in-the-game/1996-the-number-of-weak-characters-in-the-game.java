class Solution {
    public int numberOfWeakCharacters(int[][] props) {
        
        int n=props.length;
        int count=0;
        
        Arrays.sort(props,(a,b)->{
            
            if(a[0]==b[0])
                return b[1]-a[1];
            
            else
                return a[0]-b[0];
        });
        
        int min[]=new int[2];
        
        min[0]=props[n-1][0];
        min[1]=props[n-1][1];
        
        for(int i=n-2;i>=0;i--){
            
            if(props[i][0]<min[0] && props[i][1]<min[1]){
                count++;
            }
            
            if(props[i][1]>min[1]){
                min[0]=props[i][0];
                min[1]=props[i][1];
            }
        }
        return count;
    }
}