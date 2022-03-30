class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        
        int j=a[0].length-1;
        for(int i=0;i<a.length;i++)
        {
            if(target>a[i][j])
            {
                continue;
            }
            
            else if(target<a[i][j])
            {
                if(bsearch(a,i,0,j,target))
                {
                    return true;
                    
                }
            }
            else
            {
                return true;
            }
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