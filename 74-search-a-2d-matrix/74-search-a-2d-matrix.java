class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        
        int m=a[0].length;
        
        for(int i=0;i<a.length;i++)
        {
            if(target==a[i][m-1] || target==a[i][0])
                return true;
            
            else if(target<a[i][m-1] && target>a[i][0])
                return bsearch(a,i,0,m-1,target);
        }
        return false;
    }
    
    public boolean bsearch(int a[][], int row, int l, int h, int target)
    {
        while(l<=h)
        {
            int mid=(l+h)/2;
            
            if(a[row][mid]==target)
                return true;
            
            else if(target>a[row][mid])
                l=mid+1;
            
            else if(target<a[row][mid])
                h=mid-1;
        }
        return false;
    }
}