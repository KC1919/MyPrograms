class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        
        int n=a.length;
        int m=a[0].length;
        
        int minRow=0, maxRow=n-1;
        int minCol=0, maxCol=m-1;
        
        int tel=n*m;
        int count=0;
        
        List<Integer>list=new ArrayList<>();
        
        while(count<tel){
            
            // Upper Wall
            for(int i=minRow, j=minCol;j<=maxCol && count<tel; j++){
                list.add(a[i][j]);
                count++;
            }
            
            minRow++;
            
            // right wall
            for(int i=minRow, j=maxCol; i<=maxRow && count<tel; i++){
                list.add(a[i][j]);
                count++;
            }
            
            maxCol--;
            
            // bottom wall
            for(int i=maxRow, j=maxCol; j>=minCol&& count<tel; j--){
                list.add(a[i][j]);
                count++;
            }
            
            maxRow--;
            
            // left wall
            for(int i=maxRow, j=minCol; i>=minRow && count<tel; i--){
                list.add(a[i][j]);
                count++;
            }
            
            minCol++;
        }
        
        return list;
    }
}