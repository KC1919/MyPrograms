class Solution {
    public boolean searchMatrix(int[][] a, int target) 
    {
        int i=0, j=a[0].length-1;
        
        while(i<a.length && j>=0)
        {
            if(a[i][j]==target)return true;
            
            else if(a[i][j]>target)
                j--;
            
            else if(target>a[i][j])
                i++;
        }
        return false;
    }
}